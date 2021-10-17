package com.sofkau.ddd.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class FechaDeNacimiento implements ValueObject<Date> {
    private final Date fecha;

    public FechaDeNacimiento(String fecha) {
        this.fecha = validarFecha(fecha);
    }

    private Date validarFecha(String fecha){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Objects.requireNonNull(fecha, "Fecha de nacimiento requerida!!!");
        try{
            return format.parse(fecha);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Fecha de nacimiento invalida!!!");
        }
    }

    @Override
    public Date value() {
        return this.fecha;
    }
}
