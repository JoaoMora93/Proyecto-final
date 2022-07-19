package com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente;

import lombok.*;

@Data
@Builder
public class ClienteResponse {

    private Integer clienteId;
    private long dni;
    private String nombre;
    private String apellido;
}

