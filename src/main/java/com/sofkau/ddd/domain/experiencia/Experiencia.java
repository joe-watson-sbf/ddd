package com.sofkau.ddd.domain.experiencia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.entity.ExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.ExperienciaLaboralCreada;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;
import com.sofkau.ddd.domain.experiencia.value.HojaDeVidaId;

import java.util.List;

public class Experiencia extends AggregateEvent<ExperienciaId> {
    protected HojaDeVidaId hojaDeVidaId;
    protected ExperienciaLaboral experienciaLaboral;

    public Experiencia(ExperienciaId entityId,
                       HojaDeVidaId hojaDeVidaId,
                       ExperienciaLaboral experienciaLaboral) {
        super(entityId);
        appendChange(new ExperienciaLaboralCreada(hojaDeVidaId, experienciaLaboral));
    }

    private Experiencia(ExperienciaId experienciaId){
        super(experienciaId);
        subscribe(new ExperienciaChange(this));
    }

    public static Experiencia from(ExperienciaId experienciaId, List<DomainEvent> events){
        var experiencia = new Experiencia(experienciaId);
        events.forEach(experiencia::applyEvent);
        return experiencia;
    }


    public void agregarExperienciaLaboral(){

    }

    public void eliminarExperienciaLaboral(){

    }

    public void modificarExperienciaLaboralEntidad(){

    }

    public void modificarExperienciaLaboralPeriodo(){

    }

    public void modificarExperienciaLaboralConocimientosAdquiridos(){

    }
}
