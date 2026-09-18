package com.jcaa.udec.collections.domain.core.exception;

public class PersonaInvalidaException extends RuntimeException {
    public PersonaInvalidaException() {
        super("La persona contiene datos inválidos");
    }
}
