package com.sofkau.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.command.AgregarExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.ExperienciaLaboralCreada;
import com.sofkau.ddd.domain.experiencia.event.NuevaExperienciaCreada;
import com.sofkau.ddd.domain.experiencia.value.*;
import com.sofkau.ddd.usecase.experiencia.AgregarExperienciaLaboralUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AgregarExperienciaLaboralTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("AGREGAR EXPERIENCIA LABORAL ::: TEST")
    void testAgregarExperienciaLaboral(){
        // ARRANGE
        final String experienciaId = "GFD874KUI";
        var command = new AgregarExperienciaLaboral(
                new ExperienciaId(experienciaId),
                new ExperenciaLaboralId("SDD09"),
                new Institucion("SOFKAU"),
                new Periodo("04/10/2015", "04/10/2021"),
                new ConocimientosAdquiridos("PROGRAMACION")
        );
        var useCase = new AgregarExperienciaLaboralUseCase();
        Mockito.when(repository.getEventsBy(experienciaId)).thenReturn(eventStored());
        useCase.addRepository(repository);

        // ACT
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        // ASSERT
        var event = (ExperienciaLaboralCreada)events.get(0);

        Assertions.assertEquals("SDD09", event.getExperenciaLaboralId().value());
        Assertions.assertEquals("PROGRAMACION", event.getConocimientosAdquiridos().value());
        Assertions.assertEquals("SOFKAU", event.getInstitucion().value());
        Mockito.verify(repository).getEventsBy(experienciaId);
    }


    @Test
    @DisplayName("AGREGAR EXPERIENCIA LABORAL CON FECHA INCORRECTA")
    void testAgregarExperienciaLaboralConFechaIncorrecta(){
        try{
            // ARRANGE
            final String experienciaId = "GFD874KUI";
            var command = new AgregarExperienciaLaboral(
                    new ExperienciaId(experienciaId),
                    new ExperenciaLaboralId("SDD09"),
                    new Institucion("SOFKAU"),
                    new Periodo("04/10/2021", "04/10/2010"),
                    new ConocimientosAdquiridos("PROGRAMACION")
            );
            var useCase = new AgregarExperienciaLaboralUseCase();
            Mockito.when(repository.getEventsBy(experienciaId)).thenReturn(eventStored());
            useCase.addRepository(repository);

            // ACT
            var events = UseCaseHandler
                    .getInstance()
                    .syncExecutor(useCase, new RequestCommand<>(command))
                    .orElseThrow()
                    .getDomainEvents();

            // ASSERT
            var event = (ExperienciaLaboralCreada)events.get(0);

            Assertions.assertEquals("SDD09", event.getExperenciaLaboralId().value());
            Assertions.assertEquals("PROGRAMACION", event.getConocimientosAdquiridos().value());
            Assertions.assertEquals("SOFKAU", event.getInstitucion().value());
            Mockito.verify(repository).getEventsBy(experienciaId);
        }catch (IllegalArgumentException e){
            String mensaje = "La fecha inicial no puede ser mayor al final!!!";
            Assertions.assertEquals(mensaje, e.getMessage());
        }

    }


    @Test
    @DisplayName("AGREGAR EXPERIENCIA LABORAL CON FECHA NULA")
    void testAgregarExperienciaLaboralConFechaNula(){
        try{
            // ARRANGE
            final String experienciaId = "GFD874KUI";
            var command = new AgregarExperienciaLaboral(
                    new ExperienciaId(experienciaId),
                    new ExperenciaLaboralId("SDD09"),
                    new Institucion("SOFKAU"),
                    new Periodo(null, null),
                    new ConocimientosAdquiridos("PROGRAMACION")
            );
            var useCase = new AgregarExperienciaLaboralUseCase();
            Mockito.when(repository.getEventsBy(experienciaId)).thenReturn(eventStored());
            useCase.addRepository(repository);

            // ACT
            var events = UseCaseHandler
                    .getInstance()
                    .syncExecutor(useCase, new RequestCommand<>(command))
                    .orElseThrow()
                    .getDomainEvents();

            // ASSERT
            var event = (ExperienciaLaboralCreada)events.get(0);

            Assertions.assertEquals("SDD09", event.getExperenciaLaboralId().value());
            Assertions.assertEquals("PROGRAMACION", event.getConocimientosAdquiridos().value());
            Assertions.assertEquals("SOFKAU", event.getInstitucion().value());
            Mockito.verify(repository).getEventsBy(experienciaId);
        }catch (NullPointerException e){
            String mensaje = "La fecha inicio y el fin no pueden ser nulas!!!";
            Assertions.assertEquals(mensaje, e.getMessage());
        }
    }


    private List<DomainEvent> eventStored() {
        return List.of(
                new NuevaExperienciaCreada(
                        new ExperienciaId("GFD874KUI"),
                        new HojaDeVidaId("WER89P33"))
        );
    }
}
