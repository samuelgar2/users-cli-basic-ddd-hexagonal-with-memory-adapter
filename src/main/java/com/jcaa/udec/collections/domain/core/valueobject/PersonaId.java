package com.jcaa.udec.collections.domain.core.valueobject;

import com.jcaa.udec.collections.domain.core.exception.PersonaInvalidaException;

import java.util.Objects;

public record PersonaId(String valor) {

    public PersonaId {
        if (Objects.isNull(valor) || valor.isBlank() || !esNumeroEntero(valor)) {
            throw new PersonaInvalidaException();
        }
    }

    private static boolean esNumeroEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
