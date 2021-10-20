package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.ModificarPeriodoExperienciaLaboral;

public class ModificarPeriodoExperienciaLaboralUseCase extends UseCase<RequestCommand<ModificarPeriodoExperienciaLaboral>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarPeriodoExperienciaLaboral> input) {
        var command = input.getCommand();
        var experiencia = Experiencia.from(command.getExperienciaId(),
                retrieveEvents(command.getExperenciaLaboralId().value()));

        experiencia.modificarExperienciaLaboralPeriodo(
                command.getExperenciaLaboralId(),
                command.getPeriodo()
        );

        emit().onResponse(new ResponseEvents(experiencia.getUncommittedChanges()));
    }
}
