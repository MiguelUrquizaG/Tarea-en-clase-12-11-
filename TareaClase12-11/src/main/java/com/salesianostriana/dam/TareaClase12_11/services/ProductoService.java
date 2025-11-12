package com.salesianostriana.dam.TareaClase12_11.services;


import com.salesianostriana.dam.TareaClase12_11.dto.ProductoDTO;

import com.salesianostriana.dam.TareaClase12_11.mapper.ProductoMapper;

import com.salesianostriana.dam.TareaClase12_11.model.Producto;

import com.salesianostriana.dam.TareaClase12_11.repository.ProductoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;
    private final ProductoMapper productoMapper;

    public ProductoDTO findById(Long id) {
        return productoRepository.findById(id)
                .map(productoMapper::toDto)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    public ProductoDTO create(ProductoDTO dto) {
        Producto user = productoMapper.toEntity(dto);
        return productoMapper.toDto(productoRepository.save(user));
    }

    public List<ProductoDTO> findAll() {
        return productoMapper.toDtoList(productoRepository.findAll());
    }
}