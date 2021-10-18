package com.sofkau.ddd.domain.colaborador.event;

import co.com.sofka.domain.generic.DomainEvent;

public class GeneroModificado extends DomainEvent {
    public GeneroModificado() {
        super("com.sofka.ddd.colaborador.generomodificado");
    }
}
