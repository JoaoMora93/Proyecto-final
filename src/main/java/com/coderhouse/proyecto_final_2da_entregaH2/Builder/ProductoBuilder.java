package com.coderhouse.proyecto_final_2da_entregaH2.Builder;


import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductoBuilder {

    public static ProductoResponse entityToResponse(ProductoEntity producto) {
        if (Objects.nonNull(producto)) {
            return ProductoResponse.builder()
                    .productoId(producto.getProductoId())
                    .codigo(producto.getCodigo())
                    .precio(producto.getPrecio())
                    .cantidadProducto(producto.getCantidadProducto())
                    .build();
        }
        return null;
    }

    public static List<ProductoResponse> entityToResponseList(List<ProductoEntity> entityList) {
        return entityList.stream().map(ProductoBuilder::entityToResponse).collect(Collectors.toList());
    }

    public static ProductoEntity requestToEntity(ProductoRequest producto) {
        if (Objects.nonNull(producto)) {
            return ProductoEntity.builder()
                    .productoId(producto.getProductoId())
                    .codigo(producto.getCodigo())
                    .precio(producto.getPrecio())
                    .cantidadProducto(producto.getCantidadProducto())
                    .build();
        }
        return null;
    }
}
