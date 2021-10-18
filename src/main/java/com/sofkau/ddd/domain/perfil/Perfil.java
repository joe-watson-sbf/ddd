package com.sofkau.ddd.domain.perfil;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.domain.gestioncertificacion.value.HojaDeVidaId;
import com.sofkau.ddd.domain.perfil.entity.Referencia;
import com.sofkau.ddd.domain.perfil.value.FotoDePerfil;
import com.sofkau.ddd.domain.perfil.value.InformacionDeContacto;
import com.sofkau.ddd.domain.perfil.value.PerfilId;

import java.util.Set;

public class Perfil extends AggregateEvent<PerfilId> {
    protected HojaDeVidaId hojaDeVidaId;
    protected InformacionDeContacto informacionDeContacto;
    protected FotoDePerfil fotoDePerfil;
    protected Set<Referencia> referencias;


    public Perfil(PerfilId entityId) {
        super(entityId);
    }

    public void agregarNuevaReferencia(){

    }

    public void eliminarReferencia(){

    }

    public void actualizarInformacionDeContacto(){

    }

    public void actualizarFotoDePerfil(){

    }

    public void actualizarNombreCompletoReferencia(){

    }

    public void actualizarInformacionDeContactoReferencia(){

    }



}
