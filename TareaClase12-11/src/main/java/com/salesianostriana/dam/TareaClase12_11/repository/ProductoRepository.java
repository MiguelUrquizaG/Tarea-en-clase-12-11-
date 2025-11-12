package com.salesianostriana.dam.TareaClase12_11.repository;

import com.salesianostriana.dam.TareaClase12_11.model.Categoria;
import com.salesianostriana.dam.TareaClase12_11.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    public Optional<Categoria> findByNombre(String nombre);
}
