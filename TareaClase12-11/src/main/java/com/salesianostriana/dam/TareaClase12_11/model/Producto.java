package com.salesianostriana.dam.TareaClase12_11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String desc;
    private double pvp;
    private List<String> imagenes;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
