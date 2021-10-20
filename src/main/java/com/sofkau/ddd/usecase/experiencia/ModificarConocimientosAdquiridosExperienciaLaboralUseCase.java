package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.ModificarConocimientosAdquiridosExperienciaLaboral;

public class ModificarConocimientosAdquiridosExperienciaLaboralUseCase extends UseCase<RequestCommand<ModificarConocimientosAdquiridosExperienciaLaboral>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarConocimientosAdquiridosExperienciaLaboral> input) {

        var command = input.getCommand();

        var experiencia = Experiencia.from(command.getExperienciaId(),
                retrieveEvents(command.getExperenciaLaboralId().value()));

        experiencia.modificarExperienciaLaboralConocimientosAdquiridos(
                command.getExperenciaLaboralId(),
                command.getConocimientosAdquiridos()
        );

        emit().onResponse(new ResponseEvents(experiencia.getUncommittedChanges()));

    }
}
