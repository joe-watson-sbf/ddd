package com.sofkau.ddd.domain.gestioncertificacion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String nombre;


    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "Nombre requerido!!!");
    }

    @Override
    public String value() {
        return this.nombre;
    }
}
