package com.sofkau.ddd.domian.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<String> {
    private final String nombre;
    private final String apellido;


    public NombreCompleto(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre, "Nombre no puede ser nulo!!!");
        this.apellido = Objects.requireNonNull(apellido, "Apellido no puede ser nulo!!!");
    }

    @Override
    public String value() {
        return this.nombre + " " + this.apellido;
    }
}
