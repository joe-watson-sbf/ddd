package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class EstudioEducacionModificado extends DomainEvent {
    public EstudioEducacionModificado(){
        super("com.sofkau.ddd.gestioneducacion.estudioeducacionmodificada");
    }
}
