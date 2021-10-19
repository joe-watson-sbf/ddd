package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.EliminarExperienciaLaboral;

public class EliminarExperienciaLaboralUseCase extends UseCase<RequestCommand<EliminarExperienciaLaboral>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarExperienciaLaboral> input) {
        var command = input.getCommand();
        var experiencia = Experiencia.from(command.getExperienciaId(), retrieveEvents());

        experiencia.eliminarExperienciaLaboral(command.getExperenciaLaboralId());

        emit().onResponse(new ResponseEvents(experiencia.getUncommittedChanges()));
    }
}
