package com.salesianostriana.dam.TareaClase12_11.repository;

import com.salesianostriana.dam.TareaClase12_11.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Long> {

}
