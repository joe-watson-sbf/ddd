package com.sofkau.ddd.domain.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class ReferenciaEliminada extends DomainEvent {
    public ReferenciaEliminada(){
        super("com.sofkau.ddd.perfil.referenciaeliminada");
    }
}
