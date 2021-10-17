package com.sofkau.ddd.domain.gestioneducacion.value;

import co.com.sofka.domain.generic.ValueObject;

public class Institucion implements ValueObject<String> {
    private final String value;

    public Institucion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
