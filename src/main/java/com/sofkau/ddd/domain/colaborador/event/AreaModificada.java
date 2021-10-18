package com.sofkau.ddd.domain.colaborador.event;

import co.com.sofka.domain.generic.DomainEvent;

public class AreaModificada extends DomainEvent {
    public AreaModificada() {
        super("com.sofka.ddd.colaborador.areamodificada");
    }
}
