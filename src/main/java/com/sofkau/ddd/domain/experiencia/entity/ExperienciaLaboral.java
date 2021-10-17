package com.sofkau.ddd.domain.experiencia.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.domain.experiencia.value.ConocimientosAdquiridos;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;
import com.sofkau.ddd.domain.experiencia.value.Institucion;
import com.sofkau.ddd.domain.experiencia.value.Periodo;

public class ExperienciaLaboral extends Entity<ExperenciaLaboralId> {

    private Institucion institucion;
    private Periodo periodo;
    private ConocimientosAdquiridos conocimientosAdquiridos;

    public ExperienciaLaboral(ExperenciaLaboralId entityId,
                              Institucion institucion, Periodo periodo,
                              ConocimientosAdquiridos conocimientosAdquiridos) {
        super(entityId);
        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
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

    public ConocimientosAdquiridos conocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }

    public void modificarConocimientosAdquiridos(ConocimientosAdquiridos conocimientosAdquiridos) {
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }
}
