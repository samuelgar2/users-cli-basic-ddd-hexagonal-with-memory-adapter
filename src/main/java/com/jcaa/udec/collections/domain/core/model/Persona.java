package com.jcaa.udec.collections.domain.core.model;

import com.jcaa.udec.collections.domain.core.valueobject.PersonaId;
import lombok.Builder;

public class Persona {

    private final PersonaId id;
    private final String documento;
    private final String nombres;
    private final String apellidos;
    private final String fechaNacimiento;
    private final String sexo;

    @Builder
    public Persona(
            String id,
            String documento,
            String nombres,
            String apellidos,
            String fechaNacimiento,
            String sexo) {

        this.id = new PersonaId(id);
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public String getId() {
        return id.valor();
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }
}
