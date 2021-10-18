package com.sofkau.ddd.domain.gestioncertificacion.event;

import co.com.sofka.domain.generic.ValueObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Periodo implements ValueObject<List<Date>> {
    private final Date inicio;
    private final Date fin;

    public Periodo(String inicio, String fin) {
        this.inicio = verificarFecha(inicio);
        this.fin = verificarFecha(fin);
        compararFechas();
    }

    public static Date verificarFecha(String fecha){
        Objects.requireNonNull(fecha, "La fecha inicio y el fin no pueden ser nulas!!!");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return format.parse(fecha);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formato fecha incorrecto: "+ fecha + "" +
                    "\n\t\tEl formato debe ser dd/MM/yyyy \n");
        }

    }

    private void compararFechas(){
        if(this.inicio.compareTo(this.fin)>0){
            throw new IllegalArgumentException("La fecha inicial no puede ser mayor al final!!!");
        }
        if(this.inicio.compareTo(this.fin)==0){
            throw new IllegalArgumentException("La fecha inicial no puede ser igual al final!!!");
        }
    }

    @Override
    public List<Date> value() {
        return List.of(this.inicio, this.fin);
    }
}
