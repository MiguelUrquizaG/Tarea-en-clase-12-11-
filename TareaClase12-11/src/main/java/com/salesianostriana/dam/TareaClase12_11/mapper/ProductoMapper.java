package com.salesianostriana.dam.TareaClase12_11.mapper;

import com.salesianostriana.dam.TareaClase12_11.dto.AlumnoDTO;
import com.salesianostriana.dam.TareaClase12_11.dto.ProductoDTO;
import com.salesianostriana.dam.TareaClase12_11.model.Alumno;
import com.salesianostriana.dam.TareaClase12_11.model.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface ProductoMapper {

    @Mapping(target = "imagen", expression = "java(producto.getImagenes() != null && " +
            "!producto.getImagenes().isEmpty() ? producto.getImagenes().get(0) : null)")
    @Mapping(target = "categoria", source = "categoria.nombre")
    ProductoDTO toDto(Producto producto);


    @Mapping(target = "imagenes", expression = "java(dto.imagen() != null ? java.util.List.of(dto.imagen()) : java.util.List.of())")
    @Mapping(target = "categoria", ignore = true)
    Producto toEntity(ProductoDTO dto);

    List<ProductoDTO> toDtoList(List<Producto> productos);

}
