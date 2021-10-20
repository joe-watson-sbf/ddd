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
            experiencia.experienciaLaboral = new HashSet<>();
        });


        apply((ExperienciaLaboralCreada event) -> {
            var experienciaLaboral = new ExperienciaLaboral(
                    event.getExperenciaLaboralId(),
                    event.getInstitucion(),
                    event.getPeriodo(),
                    event.getConocimientosAdquiridos()
            );
            experiencia.experienciaLaboral.add(experienciaLaboral);
        });



        apply((ExperienciaLaboralEliminada event)->{
            experiencia.experienciaLaboral
                    .removeIf(experienciaLaboral ->
                            event.getExperenciaLaboralId().equals(experienciaLaboral.identity()));
        });



        apply((EntidadExperienciaLaboralModificado event)->{
            // Si no existe, va lanzar una exception
            verificarSiExisteExperienciaLaboral(event.getExperenciaLaboralId(),
                    experiencia.experienciaLaboral);

            // si pasa el test de arriba entonces es porque existe; actualizarlo
            experiencia.experienciaLaboral
                            .forEach(experienciaLaboral -> {
                                if(experienciaLaboral.identity().equals(event.getExperenciaLaboralId())){
                                    experienciaLaboral.modificarInstitucion(event.getInstitucion());
                                    experienciaLaboral.modificarPeriodo(event.getPeriodo());
                                    experienciaLaboral.modificarConocimientosAdquiridos(event.getConocimientosAdquiridos());
                                }
                            });


        });



        apply((PeriodoExperienciaLaboralModificado event)->{
            // Si no existe, va lanzar una exception
            verificarSiExisteExperienciaLaboral(event.getExperenciaLaboralId(),
                    experiencia.experienciaLaboral);


            // si pasa el test de arriba entonces es porque existe; actualizarlo
            experiencia.experienciaLaboral
                    .forEach(experienciaLaboral -> {
                        if(experienciaLaboral.identity().equals(event.getExperenciaLaboralId())){
                            experienciaLaboral.modificarPeriodo(event.getPeriodo());
                        }
                    });

        });



        apply((ConocimientosAdquiridosExperienciaLaboralModificado event)->{
            // Si no existe, va lanzar una exception
            verificarSiExisteExperienciaLaboral(event.getExperenciaLaboralId(),
                    experiencia.experienciaLaboral);


            // si pasa el test de arriba entonces es porque existe; actualizarlo
            experiencia.experienciaLaboral
                    .forEach(experienciaLaboral -> {
                        if(experienciaLaboral.identity().equals(event.getExperenciaLaboralId())){
                            experienciaLaboral.modificarConocimientosAdquiridos(
                                    experienciaLaboral.conocimientosAdquiridos()
                            );
                        }
                    });
        });


    }

    private void verificarSiExisteExperienciaLaboral(ExperenciaLaboralId id, Set<ExperienciaLaboral> experienciaLaboral){
        // Verifica ¿ si existe lo que quiere actualizar

        experienciaLaboral
                .stream()
                .filter(e -> e.identity().equals(id))
                .findFirst()
                .orElseThrow(()->
                        new IllegalArgumentException("No existe experiencia laboral con el ID indicado!!!")
                );
    }
}
