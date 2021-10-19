package com.sofkau.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;
import com.sofkau.ddd.domain.experiencia.value.HojaDeVidaId;

public class NuevaExperienciaCreada extends DomainEvent {
    private final ExperienciaId experienciaId;
    private final HojaDeVidaId hojaDeVidaId;


    public NuevaExperienciaCreada(ExperienciaId experienciaId, HojaDeVidaId hojaDeVidaId) {
        super("com.sofkau.ddd.nuevaexperienciacreada");
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
