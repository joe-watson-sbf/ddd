package com.sofkau.ddd.domain.gestioncertificacion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Institucion implements ValueObject<String> {

    private final String value;

    public Institucion(String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
