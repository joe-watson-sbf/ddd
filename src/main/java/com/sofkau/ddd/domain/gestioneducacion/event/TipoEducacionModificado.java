package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class TipoEducacionModificado extends DomainEvent {

    public TipoEducacionModificado(){
        super("com.sofkau.ddd.gestioneducacion.tipoeducacionmodificado");
    }
}
