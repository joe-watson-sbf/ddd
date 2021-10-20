package com.sofkau.ddd.usecase;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.event.NuevaExperienciaCreada;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;
import com.sofkau.ddd.domain.experiencia.value.HojaDeVidaId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EliminarExperienciaLaboralUseTest {

    @Test
    @DisplayName("ELIMINAR EXPERIENCIA LABORAL")
    void testElmininar(){

    }



    private List<DomainEvent> eventStored() {
        return List.of(
                new NuevaExperienciaCreada(
                        new ExperienciaId("GFD874KUI"),
                        new HojaDeVidaId("WER89P33"))
        );
    }
}
