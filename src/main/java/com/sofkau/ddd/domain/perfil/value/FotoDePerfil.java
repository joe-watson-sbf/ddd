package com.sofkau.ddd.domain.perfil.value;

import co.com.sofka.domain.generic.ValueObject;

public class FotoDePerfil implements ValueObject<String> {
    private final String url;

    public FotoDePerfil(String url) {
        this.url = url;
    }

    @Override
    public String value() {
        return this.url;
    }
}
