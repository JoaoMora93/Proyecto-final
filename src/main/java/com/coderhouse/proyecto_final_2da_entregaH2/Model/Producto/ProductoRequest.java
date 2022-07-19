package com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class ProductoRequest {

    @NotNull(message = "El ID es obligatorio")
    private Integer productoId;
    @NotNull(message = "El código es obligatorio")
    private Integer codigo;
    @NotBlank(message = "El precio es obligatorio")
    private Float precio;
    @NotNull(message = "La cantidad del producto es obligatoria")
    private Integer cantidadProducto;
    @NotBlank(message = "La descripcion del es obligatoria")
    private String descripcion;


}
