package com.sofkau.ddd.domian.gestioneducacion.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.domian.gestioneducacion.value.*;

public class Educacion extends Entity<EducacionId> {
    private Tipo tipo;
    private Estudio estudio;
    private Institucion institucion;
    private Periodo periodo;

    public Educacion(EducacionId entityId,
                     Tipo tipo, Estudio estudio,
                     Institucion institucion,
                     Periodo periodo) {
        super(entityId);
        this.tipo = tipo;
        this.estudio = estudio;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public Tipo tipo() {
        return tipo;
    }

    public void modificarTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estudio estudio() {
        return estudio;
    }

    public void modificarEstudio(Estudio estudio) {
        this.estudio = estudio;
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
