package com.sofkau.ddd.domain.colaborador.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PerfilAgregado extends DomainEvent {
    public PerfilAgregado() {
        super("com.sofka.ddd.colaborador.perfilagregado");
    }
}
