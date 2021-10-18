package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class EducacionEliminada extends DomainEvent {
    public EducacionEliminada(){
        super("com.sofkau.ddd.gestioneducacion.educacioneliminada");
    }
}
