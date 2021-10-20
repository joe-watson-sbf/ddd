package com.sofkau.ddd.domain.experiencia.value;

import co.com.sofka.domain.generic.Identity;

public class ExperenciaLaboralId extends Identity {
    public ExperenciaLaboralId(String id){
        super(id);
    }
    public static ExperenciaLaboralId of(String id){
        return new ExperenciaLaboralId(id);
    }
}
