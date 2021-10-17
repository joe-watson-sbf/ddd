package com.sofkau.ddd.domian.experiencia.value;

import co.com.sofka.domain.generic.Identity;

public class ExperienciaId extends Identity {
    public ExperienciaId(String id){
        super(id);
    }
    public ExperienciaId of(String id){
        return new ExperienciaId(id);
    }
}
