package com.sofkau.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;

public class EliminarExperienciaLaboral extends Command {
    private final ExperienciaId experienciaId;
    private final ExperenciaLaboralId experenciaLaboralId;

    public EliminarExperienciaLaboral(ExperienciaId experienciaId, ExperenciaLaboralId experenciaLaboralId) {
        this.experienciaId = experienciaId;
        this.experenciaLaboralId = experenciaLaboralId;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }
}
