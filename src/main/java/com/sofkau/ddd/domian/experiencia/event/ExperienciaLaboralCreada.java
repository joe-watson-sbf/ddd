package com.sofkau.ddd.domian.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domian.experiencia.entity.ExperienciaLaboral;
import com.sofkau.ddd.domian.experiencia.value.HojaDeVidaId;

public class ExperienciaLaboralCreada extends DomainEvent {

    private final HojaDeVidaId hojaDeVidaId;
    private final ExperienciaLaboral experienciaLaboral;

    public ExperienciaLaboralCreada(HojaDeVidaId hojaDeVidaId, ExperienciaLaboral experienciaLaboral) {
        super("com.sofkau.ddd.experiencialaboralcreada");
        this.hojaDeVidaId = hojaDeVidaId;
        this.experienciaLaboral = experienciaLaboral;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public ExperienciaLaboral getExperienciaLaboral() {
        return experienciaLaboral;
    }
}
