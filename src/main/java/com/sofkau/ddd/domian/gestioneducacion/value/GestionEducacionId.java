package com.sofkau.ddd.domian.gestioneducacion.value;

import co.com.sofka.domain.generic.Identity;

public class GestionEducacionId extends Identity {

    public GestionEducacionId(String id){
        super(id);
    }
    public GestionEducacionId of(String id){
        return new GestionEducacionId(id);
    }
}
