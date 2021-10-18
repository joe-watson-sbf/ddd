package com.sofkau.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.experiencia.value.*;

public class ModificarEntidadExperienciaLaboral extends Command {

    private final ExperienciaId experienciaId;
    private final ExperenciaLaboralId experenciaLaboralId;
    private final Institucion institucion;
    private final Periodo periodo;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ModificarEntidadExperienciaLaboral(ExperenciaLaboralId experenciaLaboralId,
                                              ExperienciaId experienciaId,
                                              Institucion institucion, Periodo periodo,
                                              ConocimientosAdquiridos conocimientosAdquiridos)
    {
        this.experenciaLaboralId = experenciaLaboralId;
        this.experienciaId = experienciaId;
        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }


    public ExperienciaId getExperienciaId() {
        return experienciaId;
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
