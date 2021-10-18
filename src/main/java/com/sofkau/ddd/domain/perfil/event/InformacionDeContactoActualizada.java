package com.sofkau.ddd.domain.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeContactoActualizada extends DomainEvent {

    public InformacionDeContactoActualizada(){
        super("com.sofkau.ddd.perfil.informaciondecontactoactualizada");
    }
}
