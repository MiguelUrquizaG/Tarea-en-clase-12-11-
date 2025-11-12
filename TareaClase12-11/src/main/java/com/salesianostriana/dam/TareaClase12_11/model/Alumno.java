package com.salesianostriana.dam.TareaClase12_11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;


}
