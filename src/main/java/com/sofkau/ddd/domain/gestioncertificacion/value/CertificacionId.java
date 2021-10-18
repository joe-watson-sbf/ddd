package com.sofkau.ddd.domain.gestioncertificacion.value;

import co.com.sofka.domain.generic.Identity;

public class CertificacionId extends Identity {
    public CertificacionId(String id){
        super(id);
    }

    public CertificacionId from(String value){
        return new CertificacionId(value);
    }
}
