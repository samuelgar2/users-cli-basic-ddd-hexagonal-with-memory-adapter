package com.jcaa.udec.collections.application.service.mapper;

import com.jcaa.udec.collections.application.service.dto.command.CrearPersonaComando;
import com.jcaa.udec.collections.domain.core.model.Persona;

public class PersonaMapper {

    private PersonaMapper() {
    }

    public static Persona mapearAPersona(CrearPersonaComando comando) {

        return Persona.builder()
                .id(comando.id())
                .documento(comando.documento())
                .nombres(comando.nombres())
                .apellidos(comando.apellidos())
                .fechaNacimiento(comando.fechaNacimiento())
                .sexo(comando.sexo())
                .build();
    }
}
