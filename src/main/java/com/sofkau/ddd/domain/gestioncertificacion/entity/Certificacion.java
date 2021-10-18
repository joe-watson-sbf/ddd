package com.sofkau.ddd.domain.gestioncertificacion.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.domain.gestioncertificacion.event.Nombre;
import com.sofkau.ddd.domain.gestioncertificacion.event.Periodo;
import com.sofkau.ddd.domain.gestioncertificacion.value.CertificacionId;
import com.sofkau.ddd.domain.gestioncertificacion.value.Institucion;

public class Certificacion extends Entity<CertificacionId> {
    private Nombre nombre;
    private Institucion institucion;
    private Periodo periodo;

    public Certificacion(CertificacionId entityId, Nombre nombre,
                         Institucion institucion, Periodo periodo) {
        super(entityId);
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public Nombre nombre() {
        return nombre;
    }

    public void modificarNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Institucion institucion() {
        return institucion;
    }

    public void modificarInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Periodo periodo() {
        return periodo;
    }

    public void modificarPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
