package com.sofkau.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class EducacionAgregada extends DomainEvent {
    public EducacionAgregada(){
        super("com.sofkau.ddd.gestioneducacion.educacionagregada");
    }
}
