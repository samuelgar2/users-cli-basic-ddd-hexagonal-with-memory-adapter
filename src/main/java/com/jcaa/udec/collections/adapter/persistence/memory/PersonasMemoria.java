package com.jcaa.udec.collections.adapter.persistence.memory;

import com.jcaa.udec.collections.domain.core.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonasMemoria {

    private static final List<Persona> personas = new ArrayList<>();

    private PersonasMemoria() {
    }

    public static List<Persona> obtenerPersonas() {
        return personas;
    }
}
