package com.sofkau.ddd.domain.gestioncertificacion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.domain.gestioncertificacion.entity.Certificacion;
import com.sofkau.ddd.domain.gestioncertificacion.value.GestionCertificacionId;
import com.sofkau.ddd.domain.gestioncertificacion.value.HojaDeVidaId;

public class GestionCertificacion extends AggregateEvent<GestionCertificacionId> {
    protected HojaDeVidaId hojaDeVidaId;
    protected Certificacion certificacion;

    public GestionCertificacion(GestionCertificacionId entityId) {
        super(entityId);
    }

    public void agregarNuevaCertificacion(){

    }

    public void eliminarCertificacion(){

    }

    public void modificarNombreCertificacion(){

    }

    public void modificarInstitucionCertificacion(){

    }

    public void modificarPeriodoCertificacion(){

    }



}
