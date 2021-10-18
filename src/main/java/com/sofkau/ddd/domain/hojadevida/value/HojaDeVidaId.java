package com.sofkau.ddd.domain.hojadevida.value;

import co.com.sofka.domain.generic.Identity;

public class HojaDeVidaId extends Identity {

    public HojaDeVidaId(String value) {
        super(value);
    }

    public HojaDeVidaId from(String value) {
        return new HojaDeVidaId(value);
    }
}
