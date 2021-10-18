package com.sofkau.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;
import com.sofkau.ddd.domain.experiencia.value.Periodo;

public class ModificarPeriodoExperienciaLaboral extends Command {
    private final ExperienciaId experienciaId;
    private final ExperenciaLaboralId experenciaLaboralId;
    private final Periodo periodo;


    public ModificarPeriodoExperienciaLaboral(ExperienciaId experienciaId,
                                              ExperenciaLaboralId experenciaLaboralId,
                                              Periodo periodo)
    {
        this.experienciaId = experienciaId;
        this.experenciaLaboralId = experenciaLaboralId;
        this.periodo = periodo;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
