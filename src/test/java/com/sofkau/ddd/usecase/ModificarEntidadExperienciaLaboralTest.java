package com.sofkau.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.command.ModificarEntidadExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.ExperienciaLaboralCreada;
import com.sofkau.ddd.domain.experiencia.event.NuevaExperienciaCreada;
import com.sofkau.ddd.domain.experiencia.value.*;
import com.sofkau.ddd.usecase.experiencia.ModificarEntidadExperienciaLaboralUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ModificarEntidadExperienciaLaboralTest {

    private static final String experienciaLaboralId = "PPR64OFD";

    @Mock
    private DomainEventRepository repository;

    @Test
    void testModificarEntidadExperienciaLaboral(){

        // ARRANGE
        var command = new ModificarEntidadExperienciaLaboral(
                new ExperenciaLaboralId(experienciaLaboralId),
                ExperienciaId.of("GFD874KUI"),
                new Institucion("UCO"),
                new Periodo("04/10/2015", "04/10/2030"),
                new ConocimientosAdquiridos("DEEP LEARNING")
        );


        var useCase = new ModificarEntidadExperienciaLaboralUseCase();

        Mockito.when(repository.getEventsBy(experienciaLaboralId)).thenReturn(eventStored());
        useCase.addRepository(repository);


        // ACT
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(experienciaLaboralId)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        // ASSERT
        var event = (ExperienciaLaboralCreada)events.get(0);

        Assertions.assertEquals(experienciaLaboralId, event.getExperenciaLaboralId().value());
        Assertions.assertEquals("FULL STACK", event.getConocimientosAdquiridos().value());
        Assertions.assertEquals("UCO", event.getInstitucion().value());
        Assertions.assertEquals("04/10/2015 - 04/10/2030", event.getPeriodo().value());
        Assertions.assertEquals("DEEP LEARNING", event.getConocimientosAdquiridos().value());
        Mockito.verify(repository).getEventsBy(experienciaLaboralId);
    }




    private List<DomainEvent> eventStored() {
        return List.of(
                new NuevaExperienciaCreada(
                        new ExperienciaId("GFD874KUI"),
                        new HojaDeVidaId("WER89P33")
                ),
                new ExperienciaLaboralCreada(
                        new ExperenciaLaboralId(experienciaLaboralId),
                        new Institucion("SOFKA TECH"),
                        new Periodo("11/02/2015", "05/02/2021"),
                        new ConocimientosAdquiridos("BACK END")
                )
        );
    }
}
