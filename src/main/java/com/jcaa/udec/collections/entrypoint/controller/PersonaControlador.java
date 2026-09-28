package com.jcaa.udec.collections.entrypoint.controller;

import com.jcaa.udec.collections.entrypoint.controller.dto.request.RegistrarPersonaPeticion;
import com.jcaa.udec.collections.entrypoint.controller.dto.response.ObtenerPersonaResponse;

public interface PersonaControlador {

    void registrar(RegistrarPersonaPeticion peticion);

    ObtenerPersonaResponse obtenerPorId(String id);

    ObtenerPersonaResponse obtenerTodas();
}
