package com.sofkau.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.ddd.domain.experiencia.value.ConocimientosAdquiridos;
import com.sofkau.ddd.domain.experiencia.value.ExperenciaLaboralId;

public class ConocimientosAdquiridosExperienciaLaboralModificado extends DomainEvent {

    private final ExperenciaLaboralId experenciaLaboralId;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ConocimientosAdquiridosExperienciaLaboralModificado(ExperenciaLaboralId experenciaLaboralId,
                                                               ConocimientosAdquiridos conocimientosAdquiridos)
    {
        super("com.sofkau.ddd.conocimientosadquiridosexperiencialaboralmodificado");
        this.experenciaLaboralId = experenciaLaboralId;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public ExperenciaLaboralId getExperenciaLaboralId() {
        return experenciaLaboralId;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
