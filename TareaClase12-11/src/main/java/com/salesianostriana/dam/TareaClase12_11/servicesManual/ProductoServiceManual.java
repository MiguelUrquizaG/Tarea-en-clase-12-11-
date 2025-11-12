package com.salesianostriana.dam.TareaClase12_11.servicesManual;

import com.salesianostriana.dam.TareaClase12_11.dto.ProductoDTO;
import com.salesianostriana.dam.TareaClase12_11.mapper.ProductoMapperManual;
import com.salesianostriana.dam.TareaClase12_11.model.Producto;
import com.salesianostriana.dam.TareaClase12_11.repository.ProductoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductoServiceManual {
    private final ProductoRepository productoRepository;

    public ProductoDTO findById(Long id){
        return productoRepository.findById(id)
                .map(ProductoMapperManual::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Producto not found"));
    }

    public ProductoDTO create(ProductoDTO dto){
        Producto producto = ProductoMapperManual.toEntity(dto);
        Producto saved =  productoRepository.save(producto);
        return ProductoMapperManual.toDto(saved);
    }
}
