package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class GestionEducacionCreada extends DomainEvent {
    public GestionEducacionCreada() {
        super("com.sofkau.ddd.gestioneducacioncreada");
    }
}
