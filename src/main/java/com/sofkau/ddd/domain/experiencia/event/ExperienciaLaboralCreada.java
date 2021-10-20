package com.sofkau.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.value.*;

public class ExperienciaLaboralCreada extends DomainEvent {

    private final ExperenciaLaboralId experenciaLaboralId;
    private final Institucion institucion;
    private final Periodo periodo;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ExperienciaLaboralCreada(ExperenciaLaboralId experenciaLaboralId, Institucion institucion,
                                    Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos) {
        super("com.sofkau.ddd.experiencia.experiencialaboralcreada");

        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
        this.experenciaLaboralId = experenciaLaboralId;
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
