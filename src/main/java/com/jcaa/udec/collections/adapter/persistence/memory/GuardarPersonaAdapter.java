package com.jcaa.udec.collections.adapter.persistence.memory;

import com.jcaa.udec.collections.domain.core.exception.PersonaYaExisteException;
import com.jcaa.udec.collections.domain.core.model.Persona;
import com.jcaa.udec.collections.domain.port.out.GuardarPersonaPort;

import java.util.List;
import java.util.Objects;

public class GuardarPersonaAdapter implements GuardarPersonaPort {

    private final List<Persona> personas = PersonasMemoria.obtenerPersonas();

    @Override
    public void guardar(Persona persona) {

        for (Persona personaRegistrada : personas) {

            if (Objects.equals(personaRegistrada.getId(), persona.getId())) {
                throw new PersonaYaExisteException();
            }
        }

        personas.add(persona);
    }
}
