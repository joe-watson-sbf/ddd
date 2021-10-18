package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class InstitucionEducacionModificada extends DomainEvent {
    public InstitucionEducacionModificada(){
        super("com.sofkau.ddd.gestioneducacion.institucioneducacionmodificada");
    }
}
