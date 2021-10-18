package com.sofkau.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;

public class ExperienciaLaboralEliminada extends DomainEvent {
    private final ExperenciaLaboralId experenciaLaboralId;

    public ExperienciaLaboralEliminada(ExperenciaLaboralId experenciaLaboralId) {
        super("com.sofkau.ddd.experiencialaboraleliminada");
        this.experenciaLaboralId = experenciaLaboralId;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }
}
