package com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class ClienteRequest {

    @NotNull(message = "El ID es obligatorio")
    private Integer clienteId;
    @NotNull(message = "El dni es obligatorio")
    private Long dni;
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;


}