package com.sofkau.ddd.domian.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Genero implements ValueObject<String> {
    private final String value;

    public Genero(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return this.value;
    }
}
