package com.sofkau.ddd.domain.gestioncertificacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreCertificacionModificado extends DomainEvent {

    public NombreCertificacionModificado(){
        super("com.sofka.ddd.gestioncertificado.nombrecertificacionmodificado");
    }
}
