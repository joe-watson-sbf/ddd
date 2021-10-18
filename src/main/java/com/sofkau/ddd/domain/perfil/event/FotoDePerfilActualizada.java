package com.sofkau.ddd.domain.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class FotoDePerfilActualizada extends DomainEvent {

    public FotoDePerfilActualizada(){
        super("com.sofkau.ddd.perfil.fotodeperfilactualizada");
    }
}
