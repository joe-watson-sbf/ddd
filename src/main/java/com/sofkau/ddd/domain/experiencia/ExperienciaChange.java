package com.sofkau.ddd.domain.experiencia;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.ddd.domain.experiencia.entity.ExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.*;

import java.util.HashSet;

public class ExperienciaChange extends EventChange {

    public ExperienciaChange(Experiencia experiencia){



        apply((ExperienciaLaboralCreada event) -> {
            experiencia.experienciaLaboral = new HashSet<>();
        });



        apply((ExperienciaLaboralEliminada event)->{
            experiencia.experienciaLaboral
                    .removeIf(experienciaLaboral ->
                            event.getExperenciaLaboralId().equals(experienciaLaboral.identity()));
            experiencia.eliminarExperienciaLaboral(event.getExperenciaLaboralId());
        });



        apply((EntidadExperienciaLaboralModificado event)->{
            experiencia.modificarExperienciaLaboralEntidad(
                    event.getExperenciaLaboralId(),
                    event.getInstitucion(),
                    event.getPeriodo(),
                    event.getConocimientosAdquiridos()
            );
        });



        apply((PeriodoExperienciaLaboralModificado event)->{
            experiencia.modificarExperienciaLaboralPeriodo(
                    event.getExperenciaLaboralId(),
                    event.getPeriodo()
            );
        });



        apply((ConocimientosAdquiridosExperienciaLaboralModificado event)->{
            experiencia.modificarExperienciaLaboralConocimientosAdquiridos(
                    event.getExperenciaLaboralId(),
                    event.getConocimientosAdquiridos()
            );
        });


    }
}
