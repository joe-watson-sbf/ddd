package com.sofkau.ddd.domain.colaborador.event;

import co.com.sofka.domain.generic.DomainEvent;

public class FechaNacimientoModificada extends DomainEvent {
    public FechaNacimientoModificada() {
        super("com.sofka.ddd.colaborador.fechanacimientomodificada");
    }
}
