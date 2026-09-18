package com.jcaa.udec.collections.application.service.dto.command;

public record CrearPersonaComando(
        String id,
        String documento,
        String nombres,
        String apellidos,
        String fechaNacimiento,
        String sexo) {
}
