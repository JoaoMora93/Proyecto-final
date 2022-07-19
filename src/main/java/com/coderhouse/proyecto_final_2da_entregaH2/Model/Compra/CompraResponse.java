package com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
@Builder
public class CompraResponse {

    private Integer compraId;
    private Integer clienteId;
    private Integer productoId;
    private Date fecha;
    private Float total;
}

