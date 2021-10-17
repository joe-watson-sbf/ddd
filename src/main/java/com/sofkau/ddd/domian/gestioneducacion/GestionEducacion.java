package com.sofkau.ddd.domian.gestioneducacion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.domian.gestioneducacion.entity.Educacion;
import com.sofkau.ddd.domian.gestioneducacion.value.GestionEducacionId;
import com.sofkau.ddd.domian.gestioneducacion.value.HojaDeVidaId;

import java.util.Set;

public class GestionEducacion extends AggregateEvent<GestionEducacionId> {
    protected HojaDeVidaId hojaDeVidaId;
    protected Set<Educacion> educaciones;


    public GestionEducacion(GestionEducacionId entityId, HojaDeVidaId hojaDeVidaId) {
        super(entityId);
    }

    public void agregarNuevaEducacion(){

    }

    public void eliminarEducacion(){

    }
    public void modificarTipoEducacion(){

    }


}
