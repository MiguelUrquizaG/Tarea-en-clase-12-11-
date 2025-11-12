package com.salesianostriana.dam.TareaClase12_11.dto;

import java.util.List;

public record ProductoDTO(String nombre, double pvp, List<String> imagen, String categoria) {
}
