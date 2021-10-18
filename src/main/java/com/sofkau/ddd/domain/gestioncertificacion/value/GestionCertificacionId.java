package com.sofkau.ddd.domain.gestioncertificacion.value;

import co.com.sofka.domain.generic.Identity;

public class GestionCertificacionId extends Identity {

    public GestionCertificacionId(String value){
        super(value);
    }

    public GestionCertificacionId from(String value){
        return new GestionCertificacionId(value);
    }

}
