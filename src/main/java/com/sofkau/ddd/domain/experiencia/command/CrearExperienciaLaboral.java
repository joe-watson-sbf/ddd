package com.sofkau.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.sofkau.ddd.domain.experiencia.value.*;

public class CrearExperienciaLaboral extends Command {

    private final ExperienciaId experienciaId;
    private final ExperenciaLaboralId experenciaLaboralId;
    private final Institucion institucion;
    private final Periodo periodo;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public CrearExperienciaLaboral(ExperienciaId experienciaId,
                                   ExperenciaLaboralId experenciaLaboralId,
                                   Institucion institucion, Periodo periodo,
                                   ConocimientosAdquiridos conocimientosAdquiridos)
    {
        this.institucion = institucion;
        this.experenciaLaboralId = experenciaLaboralId;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
        this.experienciaId = experienciaId;
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

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }
}
