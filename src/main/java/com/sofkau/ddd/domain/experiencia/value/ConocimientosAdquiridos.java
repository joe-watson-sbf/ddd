package com.sofkau.ddd.domain.experiencia.value;

import co.com.sofka.domain.generic.ValueObject;

public class ConocimientosAdquiridos implements ValueObject<String> {
    private final String value;

    public ConocimientosAdquiridos(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
