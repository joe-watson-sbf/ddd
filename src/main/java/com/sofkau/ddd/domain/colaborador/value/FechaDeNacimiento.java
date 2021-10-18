package com.sofkau.ddd.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        verificarMayorA17(fecha);
        try{
            return format.parse(fecha);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Fecha de nacimiento invalida!!!");
        }
    }

    private void verificarMayorA17(String fecha){
        int anoNacimiento = Integer.parseInt(fecha.split("/")[2]);
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        int edad = anoActual - anoNacimiento;

        if(edad <= 17) throw new IllegalArgumentException("Debe ser mayor a 17 años!!!");

    }

    @Override
    public Date value() {
        return this.fecha;
    }
}
