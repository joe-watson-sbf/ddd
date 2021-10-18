package com.sofkau.ddd.domain.perfil.value;

import co.com.sofka.domain.generic.Identity;

public class ReferenciaId extends Identity {
    public ReferenciaId(String value){
        super(value);
    }

    public ReferenciaId from(String value){
        return new ReferenciaId(value);
    }
}
