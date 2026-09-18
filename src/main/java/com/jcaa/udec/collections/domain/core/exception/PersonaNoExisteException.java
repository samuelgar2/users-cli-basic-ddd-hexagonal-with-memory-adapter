package com.jcaa.udec.collections.domain.core.exception;

public class PersonaNoExisteException extends RuntimeException {
    public PersonaNoExisteException() {
        super("La persona no existe");
    }
}