package com.sofkau.ddd.domain.experiencia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.entity.ExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.*;
import com.sofkau.ddd.domain.experiencia.value.*;

import java.util.List;
import java.util.Set;

public class Experiencia extends AggregateEvent<ExperienciaId> {
    protected HojaDeVidaId hojaDeVidaId;
    protected Set<ExperienciaLaboral> experienciaLaboral;

    public Experiencia(ExperienciaId entityId, HojaDeVidaId hojaDeVidaId) {
        super(entityId);

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


    public void agregarExperienciaLaboral(ExperenciaLaboralId entityId, Institucion institucion,
                                          Periodo periodo,ConocimientosAdquiridos conocimientosAdquiridos)
    {
        appendChange(new ExperienciaLaboralCreada(entityId, institucion,
                periodo, conocimientosAdquiridos));
    }

    public void eliminarExperienciaLaboral(ExperenciaLaboralId experenciaLaboralId){
        appendChange(new ExperienciaLaboralEliminada(experenciaLaboralId)).apply();
    }

    public void modificarExperienciaLaboralEntidad(ExperenciaLaboralId experenciaLaboralId,
                                                   Institucion institucion, Periodo periodo,
                                                   ConocimientosAdquiridos conocimientosAdquiridos)
    {
        appendChange(new EntidadExperienciaLaboralModificado(experenciaLaboralId,
                institucion, periodo, conocimientosAdquiridos)).apply();
    }

    public void modificarExperienciaLaboralPeriodo(ExperenciaLaboralId experenciaLaboralId, Periodo periodo){
        appendChange(new PeriodoExperienciaLaboralModificado(experenciaLaboralId, periodo)).apply();

    }

    public void modificarExperienciaLaboralConocimientosAdquiridos(ExperenciaLaboralId experenciaLaboralId,
                                                                   ConocimientosAdquiridos conocimientosAdquiridos)
    {
        appendChange(new ConocimientosAdquiridosExperienciaLaboralModificado(experenciaLaboralId,
                conocimientosAdquiridos)).apply();

    }
}
