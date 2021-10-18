package com.sofkau.ddd.domain.gestioncertificacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class InstitucionCertificacionModificada extends DomainEvent {
    public InstitucionCertificacionModificada(){
        super("com.sofka.ddd.gestioncertificado.institucioncertificacionmodificada");
    }
}
