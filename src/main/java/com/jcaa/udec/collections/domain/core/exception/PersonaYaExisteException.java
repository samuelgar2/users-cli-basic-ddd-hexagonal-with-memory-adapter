package com.jcaa.udec.collections.domain.core.exception;

public class PersonaYaExisteException extends RuntimeException {
    public PersonaYaExisteException() {
        super("La persona ya existe");
    }
}