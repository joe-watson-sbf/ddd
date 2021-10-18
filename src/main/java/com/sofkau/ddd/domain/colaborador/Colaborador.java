package com.sofkau.ddd.domain.colaborador;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.domain.colaborador.value.*;
import com.sofkau.ddd.domain.perfil.Perfil;

public class Colaborador extends AggregateEvent<ColaboradorId> {
    protected HojaDeVidaId hojaDeVidaId;
    protected FechaDeNacimiento fechaDeNacimiento;
    protected NombreCompleto nombreCompleto;
    protected Cedula cedula;
    protected Genero genero;
    protected Area area;
    protected Perfil perfil;

    public Colaborador(ColaboradorId entityId, HojaDeVidaId hojaDeVidaId,
                       FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto,
                       Cedula cedula, Genero genero, Area area)
    {
        super(entityId);
    }

    public void agregarPerfil(){

    }

    public void modificarFechaDeNacimiento(){

    }

    public void modificarNombreCompleto(){

    }

    public void modificarCedula(){

    }

    public void modificarGenero(){

    }

    public void modificarArea(){

    }

}
