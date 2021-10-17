package com.sofkau.ddd.domian.experiencia;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.ddd.domian.experiencia.event.ExperienciaLaboralCreada;

public class ExperienciaChange extends EventChange {
    public ExperienciaChange(Experiencia experiencia){

        apply((ExperienciaLaboralCreada event) -> {

        });
    }
}
