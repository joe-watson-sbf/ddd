package com.sofkau.ddd.domain.colaborador.event;

import co.com.sofka.domain.generic.DomainEvent;

public class CedulaModificada extends DomainEvent {
    public CedulaModificada() {
        super("com.sofka.ddd.colaborador.cedulamodificada");
    }
}
