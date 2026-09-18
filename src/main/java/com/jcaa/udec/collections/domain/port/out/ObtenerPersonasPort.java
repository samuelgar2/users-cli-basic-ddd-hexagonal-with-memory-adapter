package com.jcaa.udec.collections.domain.port.out;

import com.jcaa.udec.collections.domain.core.model.Persona;

import java.util.List;

public interface ObtenerPersonasPort {

    List<Persona> obtenerTodas();

    Persona buscarPorId(String id);
}