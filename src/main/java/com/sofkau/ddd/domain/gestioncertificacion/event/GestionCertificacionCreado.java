package com.sofkau.ddd.domain.gestioncertificacion.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.gestioncertificacion.value.GestionCertificacionId;

public class GestionCertificacionCreado extends DomainEvent {

    public GestionCertificacionCreado(){
        super("com.sofka.ddd.gestioncertificado.gestioncertificacioncreado");
    }
}
