package com.salesianostriana.dam.TareaClase12_11.services;

import com.salesianostriana.dam.TareaClase12_11.dto.AlumnoDTO;
import com.salesianostriana.dam.TareaClase12_11.mapper.AlumnoMapperManual;
import com.salesianostriana.dam.TareaClase12_11.model.Alumno;
import com.salesianostriana.dam.TareaClase12_11.repository.AlumnoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public  AlumnoDTO findById(Long id){
        return alumnoRepository.findById(id)
                .map(AlumnoMapperManual::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Alumno not found"));
    }

    public AlumnoDTO create(AlumnoDTO dto){
        Alumno alumno = AlumnoMapperManual.toEntity(dto);
        Alumno saved =  alumnoRepository.save(alumno);
        return AlumnoMapperManual.toDto(saved);
    }
}
