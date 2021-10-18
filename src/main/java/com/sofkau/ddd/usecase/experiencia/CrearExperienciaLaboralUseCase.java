package com.sofkau.ddd.usecase.experiencia;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkau.ddd.domain.experiencia.command.CrearExperienciaLaboral;

public class CrearExperienciaLaboralUseCase extends UseCase<RequestCommand<CrearExperienciaLaboral>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearExperienciaLaboral> input) {
        var command = input.getCommand();
    }
}
