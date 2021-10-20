package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.AgregarExperienciaLaboral;

public class AgregarExperienciaLaboralUseCase extends UseCase<RequestCommand<AgregarExperienciaLaboral>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarExperienciaLaboral> input) {

        var command = input.getCommand();

        var experiencia = Experiencia.from(command.getExperienciaId(),
                retrieveEvents(command.getExperienciaId().value()));

        experiencia.agregarExperienciaLaboral(
                command.getExperenciaLaboralId(),
                command.getInstitucion(),
                command.getPeriodo(),
                command.getConocimientosAdquiridos()
        );

        emit().onResponse(new ResponseEvents(experiencia.getUncommittedChanges()));
    }
}
