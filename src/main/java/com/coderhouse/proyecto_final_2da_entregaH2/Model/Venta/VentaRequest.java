package com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta;

import lombok.Data;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.NotNull;

@Data
@Validated
public class VentaRequest {

    @NotNull(message = "El ID de venta es obligatorio")
    private Integer ventaId;
    @NotNull(message = "El ID del cliente es obligatorio")
    private Integer clienteId;
    @NotNull(message = "El ID de compra es obligatorio")
    private Integer compraId;
    @NotNull(message = "El total de la Venta es obligatoria")
    private Float totalVenta;
}
