package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.Experiencia;
import com.sofkau.ddd.domain.experiencia.command.CrearNuevaExperiencia;

public class CrearNuevaExperienciaUseCase extends UseCase<RequestCommand<CrearNuevaExperiencia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearNuevaExperiencia> input) {
        var command = input.getCommand();

        var experiencia = new Experiencia(
                command.getExperienciaId(),
                command.getHojaDeVidaId()
        );

        emit().onResponse(new ResponseEvents(experiencia.getUncommittedChanges()));
    }
}
