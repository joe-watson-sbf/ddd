package com.sofkau.ddd.domain.experiencia;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.ddd.domain.experiencia.entity.ExperienciaLaboral;
import com.sofkau.ddd.domain.experiencia.event.*;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;

import java.util.HashSet;
import java.util.Set;

public class ExperienciaChange extends EventChange {

    public ExperienciaChange(Experiencia experiencia){

        apply((NuevaExperienciaCreada event)->{
            experiencia.hojaDeVidaId = event.getHojaDeVidaId();
        });


        apply((ExperienciaLaboralCreada event) -> {
            experiencia.experienciaLaboral = new ExperienciaLaboral(
                    event.getExperenciaLaboralId(),
                    event.getInstitucion(),
                    event.getPeriodo(),
                    event.getConocimientosAdquiridos()
            );
        });

        apply((ExperienciaLaboralEliminada event)->{
            experiencia.experienciaLaboral = null;
        });

        apply((EntidadExperienciaLaboralModificado event)->{
            boolean verified = experiencia.experienciaLaboral.identity().equals(event.getExperenciaLaboralId());

            if(verified){
                experiencia.experienciaLaboral.modificarConocimientosAdquiridos(event.getConocimientosAdquiridos());
                experiencia.experienciaLaboral.modificarPeriodo(event.getPeriodo());
                experiencia.experienciaLaboral.modificarInstitucion(event.getInstitucion());
            }

            if(!verified){
                throw new IllegalArgumentException("Experiencia laboral no encontrado!!!");
            }
        });



        apply((PeriodoExperienciaLaboralModificado event)->{

            boolean verified = experiencia.experienciaLaboral.identity().equals(event.getExperenciaLaboralId());
            if(verified){
                experiencia.experienciaLaboral.modificarPeriodo(event.getPeriodo());
            }

            if(!verified){
                throw new IllegalArgumentException("Experiencia laboral no encontrado!!!");
            }
        });



        apply((ConocimientosAdquiridosExperienciaLaboralModificado event)->{

            boolean verified = experiencia.experienciaLaboral.identity().equals(event.getExperenciaLaboralId());
            if(verified){
                experiencia.experienciaLaboral.modificarConocimientosAdquiridos(event.getConocimientosAdquiridos());
            }

            if(!verified){
                throw new IllegalArgumentException("Experiencia laboral no encontrado!!!");
            }

        });


    }

}
