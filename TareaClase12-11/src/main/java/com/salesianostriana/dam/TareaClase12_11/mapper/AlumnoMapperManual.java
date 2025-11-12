package com.salesianostriana.dam.TareaClase12_11.mapper;

import com.salesianostriana.dam.TareaClase12_11.dto.AlumnoDTO;
import com.salesianostriana.dam.TareaClase12_11.model.Alumno;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class AlumnoMapperManual {

    public AlumnoDTO toDto(Alumno alumno){
        if (alumno == null) return null;

        return new AlumnoDTO(
                alumno.getNombre(),
                alumno.getApellido1()+"," +alumno.getApellido2(),
                alumno.getEmail(),
                alumno.getCurso(),
                alumno.getDireccion()
        );
    }

    public Alumno toEntity(AlumnoDTO dto){
        if(dto == null) return null;

        return Alumno.builder()
                .nombre(dto.nombre())
                .apellido1(dto.apellidos().split(",")[0])
                .apellido2(dto.apellidos().split(",")[1])
                .email(dto.email())
                .curso(dto.curso())
                .direccion(dto.direccion())
                .build();
    }
}
