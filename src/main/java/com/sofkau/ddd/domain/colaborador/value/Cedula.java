package com.sofkau.ddd.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cedula implements ValueObject<String> {
    private final String value;

    public Cedula(String value) {
        this.value = Objects.requireNonNull(value, "Celuda requerida!!!");
    }

    @Override
    public String value() {
        return this.value;
    }
}
