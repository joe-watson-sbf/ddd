package com.sofkau.ddd.domian.colaborador.value;

import co.com.sofka.domain.generic.Identity;

public class ColaboradorId extends Identity {
    public ColaboradorId(String value){
        super(value);
    }

    public ColaboradorId from(String value){
        return new ColaboradorId(value);
    }
}
