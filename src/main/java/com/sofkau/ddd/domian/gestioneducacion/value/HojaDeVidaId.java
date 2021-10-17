package com.sofkau.ddd.domian.gestioneducacion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HojaDeVidaId implements ValueObject<Integer> {
    private final Integer value;

    public HojaDeVidaId(Integer value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    @Override
    public Integer value() {
        return this.value;
    }
}
