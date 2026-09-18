package com.jcaa.udec.collections.application.service;

import com.jcaa.udec.collections.application.service.dto.query.ObtenerPersonaConsulta;
import com.jcaa.udec.collections.application.service.ports.in.ObtenerPersonaUseCase;
import com.jcaa.udec.collections.domain.core.model.Persona;
import com.jcaa.udec.collections.domain.port.out.ObtenerPersonasPort;

import java.util.List;

public class ObtenerPersonasService implements ObtenerPersonaUseCase {

    private final ObtenerPersonasPort obtenerPersonasPort;

    public ObtenerPersonasService(ObtenerPersonasPort obtenerPersonasPort) {
        this.obtenerPersonasPort = obtenerPersonasPort;
    }

    @Override
    public List<Persona> obtenerTodas() {
        return obtenerPersonasPort.obtenerTodas();
    }

    @Override
    public Persona obtenerPorId(ObtenerPersonaConsulta consulta) {
        return obtenerPersonasPort.buscarPorId(consulta.id());
    }
}