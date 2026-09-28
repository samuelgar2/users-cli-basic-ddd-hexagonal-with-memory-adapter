package com.jcaa.udec.collections.entrypoint.controller.dto.response;

import lombok.Builder;

@Builder
public record PersonaResponse(
        String id,
        String documento,
        String nombres,
        String apellidos,
        String fechaNacimiento,
        String sexo) {
}
