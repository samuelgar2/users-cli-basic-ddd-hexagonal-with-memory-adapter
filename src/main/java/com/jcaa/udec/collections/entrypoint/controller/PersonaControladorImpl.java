package com.jcaa.udec.collections.entrypoint.controller;

import com.jcaa.udec.collections.application.service.dto.command.CrearPersonaComando;
import com.jcaa.udec.collections.application.service.dto.query.ObtenerPersonaConsulta;
import com.jcaa.udec.collections.application.service.ports.in.ObtenerPersonaUseCase;
import com.jcaa.udec.collections.application.service.ports.in.RegistrarPersonaUseCase;
import com.jcaa.udec.collections.entrypoint.controller.dto.request.RegistrarPersonaPeticion;
import com.jcaa.udec.collections.entrypoint.controller.dto.response.ObtenerPersonaResponse;
import com.jcaa.udec.collections.entrypoint.controller.mapper.PersonaResponseMapper;

public class PersonaControladorImpl implements PersonaControlador {

    private final RegistrarPersonaUseCase registrarPersonaUseCase;
    private final ObtenerPersonaUseCase obtenerPersonaUseCase;

    public PersonaControladorImpl(
            RegistrarPersonaUseCase registrarPersonaUseCase,
            ObtenerPersonaUseCase obtenerPersonaUseCase) {

        this.registrarPersonaUseCase = registrarPersonaUseCase;
        this.obtenerPersonaUseCase = obtenerPersonaUseCase;
    }

    @Override
    public void registrar(RegistrarPersonaPeticion peticion) {

        CrearPersonaComando comando = new CrearPersonaComando(
                peticion.id(),
                peticion.documento(),
                peticion.nombres(),
                peticion.apellidos(),
                peticion.fechaNacimiento(),
                peticion.sexo());

        registrarPersonaUseCase.registrar(comando);
    }

    @Override
    public ObtenerPersonaResponse obtenerPorId(String id) {

        ObtenerPersonaConsulta consulta =
                new ObtenerPersonaConsulta(id);

        return PersonaResponseMapper.mapearAResponse(
                obtenerPersonaUseCase.obtenerPorId(consulta));
    }

    @Override
    public ObtenerPersonaResponse obtenerTodas() {

        return PersonaResponseMapper.mapearAResponse(
                obtenerPersonaUseCase.obtenerTodas());
    }
}