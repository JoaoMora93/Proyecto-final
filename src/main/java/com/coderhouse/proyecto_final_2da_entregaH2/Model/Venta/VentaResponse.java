package com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class VentaResponse {

    private Integer ventaId;
    private Integer clienteId;
    private Integer compraId;
    private Float totalVenta;
}

