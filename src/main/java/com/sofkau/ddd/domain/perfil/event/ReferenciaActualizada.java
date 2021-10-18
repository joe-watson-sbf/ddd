package com.sofkau.ddd.domain.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class ReferenciaActualizada extends DomainEvent {

    public ReferenciaActualizada(){
        super("com.sofkau.ddd.perfil.referenciaactualizada");
    }
}
