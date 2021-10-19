package com.sofkau.ddd.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.CrearNuevaExperiencia;
import com.sofkau.ddd.domain.experiencia.event.NuevaExperienciaCreada;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;
import com.sofkau.ddd.domain.experiencia.value.HojaDeVidaId;
import com.sofkau.ddd.usecase.experiencia.CrearNuevaExperienciaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearNuevaExperienciaTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("CREAR EXPERIENCIA ::: TEST")
    void crearExperiencia(){

        // Arrange
        var experienciaId = new ExperienciaId("R0QW45");
        var hojaDeVidaId = new HojaDeVidaId("HH7YT897");
        var command = new CrearNuevaExperiencia(
                experienciaId,
                hojaDeVidaId
        );

        var useCase = new CrearNuevaExperienciaUseCase();


        // Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (NuevaExperienciaCreada)events.get(0);

        // ASSERT
        Assertions.assertEquals("R0QW45" , event.getExperienciaId().value());
        Assertions.assertEquals("HH7YT897" , event.getHojaDeVidaId().value());

    }


}
