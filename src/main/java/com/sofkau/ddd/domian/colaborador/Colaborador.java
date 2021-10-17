package com.sofkau.ddd.domian.colaborador;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.ddd.domian.colaborador.value.*;
import com.sofkau.ddd.domian.perfil.Perfil;

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
}
