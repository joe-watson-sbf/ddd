package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.ModificarEntidadExperienciaLaboral;

public class ModificarEntidadExperienciaLaboralUseCase extends UseCase<RequestCommand<ModificarEntidadExperienciaLaboral>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarEntidadExperienciaLaboral> input) {
        var command = input.getCommand();

        var experiencia = Experiencia.from(command.getExperienciaId(), retrieveEvents());

        experiencia.modificarExperienciaLaboralEntidad(
                command.getExperenciaLaboralId(),
                command.getInstitucion(),
                command.getPeriodo(),
                command.getConocimientosAdquiridos()
        );

        emit().onResponse(new ResponseEvents(experiencia.getUncommittedChanges()));
    }
}
