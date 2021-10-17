package com.sofkau.ddd.domian.gestioneducacion.value;

import co.com.sofka.domain.generic.Identity;

public class EducacionId extends Identity {
    public EducacionId(String id){
        super(id);
    }

    public EducacionId from(String id){
        return new EducacionId(id);
    }

}
