package com.sofkau.ddd.domain.perfil.entity;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.ddd.domain.perfil.value.InformacionDeContacto;
import com.sofkau.ddd.domain.perfil.value.NombreCompleto;
import com.sofkau.ddd.domain.perfil.value.ReferenciaId;

public class Referencia extends Entity<ReferenciaId> {
    private InformacionDeContacto informacionDeContacto;
    private NombreCompleto nombreCompleto;

    public Referencia(ReferenciaId entityId, InformacionDeContacto informacionDeContacto,
                      NombreCompleto nombreCompleto) {
        super(entityId);
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public InformacionDeContacto informacionDeContacto() {
        return informacionDeContacto;
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto) {
        this.informacionDeContacto = informacionDeContacto;
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }

    public void actualizarNombreCompleto(NombreCompleto nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
