package com.sofkau.ddd.domain.experiencia.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HojaDeVidaId implements ValueObject<String> {
    private final String value;

    public HojaDeVidaId(String value) {
        Objects.requireNonNull(value);
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Hoja de vida id requerida!!!");
        }
    }


    @Override
    public String value() {
        return this.value;
    }
}
