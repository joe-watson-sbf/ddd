package com.sofkau.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.experiencia.value.ConocimientosAdquiridos;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;
import com.sofkau.ddd.domain.experiencia.value.ExperienciaId;

public class ModificarConocimientosAdquiridosExperienciaLaboral extends Command {
    private final ExperienciaId experienciaId;
    private final ExperenciaLaboralId experenciaLaboralId;
    private final ConocimientosAdquiridos conocimientosAdquiridos;


    public ModificarConocimientosAdquiridosExperienciaLaboral(ExperienciaId experienciaId,
                                                              ExperenciaLaboralId experenciaLaboralId,
                                                              ConocimientosAdquiridos conocimientosAdquiridos) {
        this.experienciaId = experienciaId;
        this.experenciaLaboralId = experenciaLaboralId;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
