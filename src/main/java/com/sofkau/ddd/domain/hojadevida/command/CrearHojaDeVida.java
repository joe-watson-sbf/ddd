package com.sofkau.ddd.domain.hojadevida.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.hojadevida.value.HojaDeVidaId;

public class CrearHojaDeVida extends Command {

    private final HojaDeVidaId hojaDeVidaId;

    public CrearHojaDeVida(HojaDeVidaId hojaDeVidaId){
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
