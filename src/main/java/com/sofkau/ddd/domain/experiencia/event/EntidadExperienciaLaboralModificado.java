package com.sofkau.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.value.ConocimientosAdquiridos;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;
import com.sofkau.ddd.domain.experiencia.value.Institucion;
import com.sofkau.ddd.domain.experiencia.value.Periodo;

public class EntidadExperienciaLaboralModificado extends DomainEvent {

    private final ExperenciaLaboralId experenciaLaboralId;
    private final Institucion institucion;
    private final Periodo periodo;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public EntidadExperienciaLaboralModificado(ExperenciaLaboralId experenciaLaboralId, Institucion institucion,
                                    Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos)
    {
        super("com.sofkau.ddd.experiencialaboralcreada");
        this.experenciaLaboralId = experenciaLaboralId;
        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }


    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }
}
