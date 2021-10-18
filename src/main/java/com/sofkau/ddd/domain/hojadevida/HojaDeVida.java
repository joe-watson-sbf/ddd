package com.sofkau.ddd.domain.hojadevida;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.domain.hojadevida.value.HojaDeVidaId;

public class HojaDeVida extends AggregateEvent<HojaDeVidaId> {

    public HojaDeVida(HojaDeVidaId entityId) {
        super(entityId);
    }

}
