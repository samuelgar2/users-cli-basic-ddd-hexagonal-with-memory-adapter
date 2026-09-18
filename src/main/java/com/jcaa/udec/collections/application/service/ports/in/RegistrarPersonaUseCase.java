package com.jcaa.udec.collections.application.service.ports.in;

import com.jcaa.udec.collections.application.service.dto.command.CrearPersonaComando;

public interface RegistrarPersonaUseCase {

    void registrar(CrearPersonaComando comando);
}