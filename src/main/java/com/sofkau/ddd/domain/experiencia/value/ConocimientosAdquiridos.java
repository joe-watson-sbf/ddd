package com.sofkau.ddd.domain.experiencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ConocimientosAdquiridos implements ValueObject<String> {
    private final String value;

    public ConocimientosAdquiridos(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
