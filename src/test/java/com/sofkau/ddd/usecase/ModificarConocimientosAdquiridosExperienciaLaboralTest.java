package com.sofkau.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.command.CrearNuevaExperiencia;
import com.sofkau.ddd.domain.experiencia.command.ModificarConocimientosAdquiridosExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.ExperienciaLaboralCreada;
import com.sofkau.ddd.domain.experiencia.event.NuevaExperienciaCreada;
import com.sofkau.ddd.domain.experiencia.value.*;
import com.sofkau.ddd.usecase.experiencia.CrearNuevaExperienciaUseCase;
import com.sofkau.ddd.usecase.experiencia.ModificarConocimientosAdquiridosExperienciaLaboralUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ModificarConocimientosAdquiridosExperienciaLaboralTest {

    private static final String experienciaID = "GHG43";
    private static final String experienciaLaboralId = "UIRE98";

    @Mock
    private DomainEventRepository repository;



    @Test
    @DisplayName("Modificar Conocimientos Adquiridos")
    void testModificarConocimientos(){

        var useCaseCrearExperiencia = new CrearNuevaExperienciaUseCase();
        useCaseCrearExperiencia.addRepository(repository);
        var commandCrearExperiencia = new CrearNuevaExperiencia(
                new ExperienciaId(experienciaID),
                new HojaDeVidaId("GHGD9048")
        );

        UseCaseHandler
                .getInstance()
                .syncExecutor(useCaseCrearExperiencia, new RequestCommand<>(commandCrearExperiencia))
                .orElseThrow();


        // ARRANGE




        var command = new ModificarConocimientosAdquiridosExperienciaLaboral(
                new ExperienciaId(experienciaID),
                new ExperenciaLaboralId(experienciaLaboralId),
                new ConocimientosAdquiridos("FULL STACK")
        );


        var useCase = new ModificarConocimientosAdquiridosExperienciaLaboralUseCase();
        Mockito.when(repository.getEventsBy(experienciaID)).thenReturn(eventStored());
        useCase.addRepository(repository);


        // ACT
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        // ASSERT
        var event = (ExperienciaLaboralCreada)events.get(0);

        Assertions.assertEquals(experienciaLaboralId, event.getExperenciaLaboralId().value());
        Assertions.assertEquals("FULL STACK", event.getConocimientosAdquiridos().value());
        Assertions.assertEquals("SOFKA TECH", event.getInstitucion().value());
        Mockito.verify(repository).getEventsBy(experienciaID);
    }


    private List<DomainEvent> eventStored() {

        var crearExperienciaLaboral = new ExperienciaLaboralCreada(
                new ExperenciaLaboralId(experienciaLaboralId),
                new Institucion("SOFKAU"),
                new Periodo("04/10/2015", "04/10/2021"),
                new ConocimientosAdquiridos("SCRUM")
        );

        return List.of(crearExperienciaLaboral);
    }


}
