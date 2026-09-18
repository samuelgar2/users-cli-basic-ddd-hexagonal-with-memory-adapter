package com.jcaa.udec.collections.application.service.ports.in;

import com.jcaa.udec.collections.application.service.dto.query.ObtenerPersonaConsulta;
import com.jcaa.udec.collections.domain.core.model.Persona;

import java.util.List;

public interface ObtenerPersonaUseCase {

    List<Persona> obtenerTodas();

    Persona obtenerPorId(ObtenerPersonaConsulta consulta);
}