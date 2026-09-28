package com.jcaa.udec.collections.entrypoint.controller.dto.response;

import java.util.List;

public record ObtenerPersonaResponse(List<PersonaResponse> personas) {

    public ObtenerPersonaResponse {
        personas = List.copyOf(personas);
    }

    public boolean estaVacia() {
        return personas.isEmpty();
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), personas.stream()
                .map(PersonaResponse::toString)
                .toList());
    }
}
