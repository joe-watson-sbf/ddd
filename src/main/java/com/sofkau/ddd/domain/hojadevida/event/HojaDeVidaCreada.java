package com.sofkau.ddd.domain.hojadevida.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.hojadevida.value.HojaDeVidaId;

public class HojaDeVidaCreada extends DomainEvent {

    private final HojaDeVidaId hojaDeVidaId;

    public HojaDeVidaCreada(HojaDeVidaId hojaDeVidaId) {
        super("com.sofkau.ddd.hojadevida.hojadevidacreada");
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
