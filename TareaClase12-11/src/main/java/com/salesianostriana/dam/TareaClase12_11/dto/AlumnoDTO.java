package com.salesianostriana.dam.TareaClase12_11.dto;

import com.salesianostriana.dam.TareaClase12_11.model.Curso;
import com.salesianostriana.dam.TareaClase12_11.model.Direccion;

public record AlumnoDTO(String nombre, String apellido1,String apellido2, String email, Curso curso, Direccion direccion) {

}
