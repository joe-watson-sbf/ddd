package com.sofkau.ddd.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<String> {
    private final String nombre;
    private final String apellido;


    public NombreCompleto(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre, "Nombre no puede ser nulo!!!");
        this.apellido = Objects.requireNonNull(apellido, "Apellido no puede ser nulo!!!");

        if(this.nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser vacio!!!");
        }

        if(this.apellido.isBlank()){
            throw new IllegalArgumentException("El apellido no puede ser vacio!!!");
        }
    }

    @Override
    public String value() {
        return this.nombre + " " + this.apellido;
    }
}
