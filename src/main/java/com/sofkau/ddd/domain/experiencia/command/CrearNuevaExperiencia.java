package com.sofkau.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;
import com.sofkau.ddd.domain.experiencia.value.HojaDeVidaId;

public class CrearNuevaExperiencia extends Command {

    private final ExperienciaId experienciaId;
    private final HojaDeVidaId hojaDeVidaId;


    public CrearNuevaExperiencia(ExperienciaId experienciaId, HojaDeVidaId hojaDeVidaId) {
        this.experienciaId = experienciaId;
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
