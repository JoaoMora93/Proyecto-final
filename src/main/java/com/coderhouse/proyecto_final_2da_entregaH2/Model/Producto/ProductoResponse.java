package com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto;

import lombok.*;

@Data
@Builder
public class ProductoResponse {

    private Integer productoId;
    private Integer codigo;
    private Float precio;
    private Integer cantidadProducto;
    private String descripcion;

}

