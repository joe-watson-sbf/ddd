package com.sofkau.ddd.domain.perfil.value;

import co.com.sofka.domain.generic.Identity;

public class PerfilId extends Identity {
    public PerfilId(String value){
        super(value);
    }

    public PerfilId from(String value){
        return new PerfilId(value);
    }
}
