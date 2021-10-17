package com.sofkau.ddd.domain.gestioneducacion.value;

import co.com.sofka.domain.generic.ValueObject;

public class Estudio implements ValueObject<String> {
    private final String value;

    public Estudio(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
