package com.sofkau.ddd.domain.colaborador.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreCompletoModificado extends DomainEvent {

    public NombreCompletoModificado() {
        super("com.sofka.ddd.colaborador.nombrecompletomodificado");
    }
}
