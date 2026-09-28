package com.jcaa.udec.collections.entrypoint.controller.dto.request;

public record RegistrarPersonaPeticion(
        String id,
        String documento,
        String nombres,
        String apellidos,
        String fechaNacimiento,
        String sexo) {
}