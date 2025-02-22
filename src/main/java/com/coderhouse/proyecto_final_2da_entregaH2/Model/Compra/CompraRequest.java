package com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Validated
public class CompraRequest {

    @NotNull(message = "El ID es obligatorio")
    private Integer compraId;
    @NotNull(message = "El ID del cliente es obligatorio")
    private Integer clienteId;
    @NotNull(message = "El ID del producto es obligatorio")
    private Integer productoId;
    @NotNull(message = "La fecha de compra es obligatoria")
    private Date fecha;
    @NotNull(message = "El total es obligatoria")
    private Float total;

}
