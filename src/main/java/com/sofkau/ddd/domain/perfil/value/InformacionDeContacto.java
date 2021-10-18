package com.sofkau.ddd.domain.perfil.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionDeContacto implements ValueObject<String> {
    private final String info;

    public InformacionDeContacto(String info) {
        this.info = Objects.requireNonNull(info);
    }

    @Override
    public String value() {
        return this.info;
    }
}
