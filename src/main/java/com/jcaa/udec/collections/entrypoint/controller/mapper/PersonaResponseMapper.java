package com.jcaa.udec.collections.entrypoint.controller.mapper;

import com.jcaa.udec.collections.domain.core.model.Persona;
import com.jcaa.udec.collections.entrypoint.controller.dto.response.ObtenerPersonaResponse;
import com.jcaa.udec.collections.entrypoint.controller.dto.response.PersonaResponse;

import java.util.List;

public final class PersonaResponseMapper {

    private PersonaResponseMapper() {
    }

    public static ObtenerPersonaResponse mapearAResponse(Persona persona) {
        return new ObtenerPersonaResponse(
                List.of(mapearAResponsePersona(persona)));
    }

    public static ObtenerPersonaResponse mapearAResponse(List<Persona> personas) {
        return new ObtenerPersonaResponse(
                personas.stream()
                        .map(PersonaResponseMapper::mapearAResponsePersona)
                        .toList());
    }

    private static PersonaResponse mapearAResponsePersona(Persona persona) {
        return PersonaResponse.builder()
                .id(persona.getId())
                .documento(persona.getDocumento())
                .nombres(persona.getNombres())
                .apellidos(persona.getApellidos())
                .fechaNacimiento(persona.getFechaNacimiento())
                .sexo(persona.getSexo())
                .build();
    }
}