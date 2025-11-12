package com.salesianostriana.dam.TareaClase12_11.mapper;

import com.salesianostriana.dam.TareaClase12_11.dto.AlumnoDTO;
import com.salesianostriana.dam.TareaClase12_11.model.Alumno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface AlumnoMapper {

    @Mapping(target = "apellidos", expression = "java(alumno.getApellido1() + \" \" + alumno.getApellido2())")
    AlumnoDTO toDto(Alumno alumno);


    @Mapping(target = "apellido1", expression = "java(dto.apellidos().split(\" \")[0])")
    @Mapping(target = "apellido2", expression = "java(dto.apellidos().split(\" \")[1])")
    Alumno toEntity(AlumnoDTO dto);

    List<AlumnoDTO>toDtoList(List<Alumno> alumnos);
}
