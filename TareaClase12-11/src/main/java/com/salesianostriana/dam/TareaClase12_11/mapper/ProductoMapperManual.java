package com.salesianostriana.dam.TareaClase12_11.mapper;

import com.salesianostriana.dam.TareaClase12_11.dto.ProductoDTO;
import com.salesianostriana.dam.TareaClase12_11.model.Producto;
import com.salesianostriana.dam.TareaClase12_11.repository.ProductoRepository;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductoMapperManual {

    private  ProductoRepository productoRepository;

    public ProductoDTO toDto(Producto producto){
        if (producto == null) return null;
        return new ProductoDTO(
                producto.getNombre(),
                producto.getPvp(),
                producto.getImagenes(),
                producto.getCategoria().getNombre()
        );
    }

    public Producto toEntity(ProductoDTO dto){
        if(dto == null) return null;

        return Producto.builder()
                .nombre(dto.nombre())
                .pvp(dto.pvp())
                .imagenes(dto.imagen())
                .categoria(productoRepository.findByNombre(dto.categoria()).get())
                .build();
    }

}
