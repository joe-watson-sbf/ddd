package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PeriodoEducacionModificada extends DomainEvent {
    public PeriodoEducacionModificada(){
        super("com.sofkau.ddd.gestioneducacion.periodoeducacionmodificada");
    }
}
