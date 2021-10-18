package com.sofkau.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;
import com.sofkau.ddd.domain.experiencia.value.Periodo;

public class PeriodoExperienciaLaboralModificado extends DomainEvent {

    private final ExperenciaLaboralId experenciaLaboralId;
    private final Periodo periodo;


    public PeriodoExperienciaLaboralModificado(ExperenciaLaboralId experenciaLaboralId, Periodo periodo) {
        super("com.sofkau.ddd.periodoexperiencialaboralmodificado");
        this.experenciaLaboralId = experenciaLaboralId;
        this.periodo = periodo;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
