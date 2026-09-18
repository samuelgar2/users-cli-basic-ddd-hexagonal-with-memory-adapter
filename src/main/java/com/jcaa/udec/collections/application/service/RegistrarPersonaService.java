package com.jcaa.udec.collections.application.service;

import com.jcaa.udec.collections.application.service.dto.command.CrearPersonaComando;
import com.jcaa.udec.collections.application.service.mapper.PersonaMapper;
import com.jcaa.udec.collections.application.service.ports.in.RegistrarPersonaUseCase;
import com.jcaa.udec.collections.domain.core.model.Persona;
import com.jcaa.udec.collections.domain.port.out.GuardarPersonaPort;

public class RegistrarPersonaService implements RegistrarPersonaUseCase {

    private final GuardarPersonaPort guardarPersonaPort;

    public RegistrarPersonaService(GuardarPersonaPort guardarPersonaPort) {
        this.guardarPersonaPort = guardarPersonaPort;
    }

    @Override
    public void registrar(CrearPersonaComando comando) {
        Persona persona = PersonaMapper.mapearAPersona(comando);
        guardarPersonaPort.guardar(persona);
    }
}