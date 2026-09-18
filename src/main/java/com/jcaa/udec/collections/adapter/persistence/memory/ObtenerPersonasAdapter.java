package com.jcaa.udec.collections.adapter.persistence.memory;

import com.jcaa.udec.collections.domain.core.exception.PersonaNoExisteException;
import com.jcaa.udec.collections.domain.core.model.Persona;
import com.jcaa.udec.collections.domain.port.out.ObtenerPersonasPort;

import java.util.List;
import java.util.Objects;

public class ObtenerPersonasAdapter implements ObtenerPersonasPort {

    private final List<Persona> personas = PersonasMemoria.obtenerPersonas();

    @Override
    public List<Persona> obtenerTodas() {
        return List.copyOf(personas);
    }

    @Override
    public Persona buscarPorId(String id) {

        for (Persona persona : personas) {

            if (Objects.equals(persona.getId(), id)) {
                return persona;
            }
        }

        throw new PersonaNoExisteException();
    }
}