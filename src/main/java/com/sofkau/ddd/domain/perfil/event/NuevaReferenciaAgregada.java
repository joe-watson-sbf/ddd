package com.sofkau.ddd.domain.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NuevaReferenciaAgregada extends DomainEvent {
    public NuevaReferenciaAgregada(){
        super("com.sofkau.ddd.perfil.nuevareferenciaagregada");
    }
}
