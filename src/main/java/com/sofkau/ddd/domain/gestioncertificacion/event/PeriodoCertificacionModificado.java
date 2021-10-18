package com.sofkau.ddd.domain.gestioncertificacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PeriodoCertificacionModificado extends DomainEvent {

    public PeriodoCertificacionModificado(){
        super("com.sofka.ddd.gestioncertificado.periodocertificacionmodificado");
    }
}
