package com.salesianostriana.dam.TareaClase12_11.mapper;

import com.salesianostriana.dam.TareaClase12_11.dto.AlumnoDTO;
import com.salesianostriana.dam.TareaClase12_11.model.Alumno;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AlumnoMapper {
    public AlumnoDTO toDto(Alumno alumno){
        if (alumno == null) return null;
        return new AlumnoDTO(
                alumno.getNombre(),
                alumno.getApellido1()+ " "+alumno.getApellido2(),
        );
    }
}
