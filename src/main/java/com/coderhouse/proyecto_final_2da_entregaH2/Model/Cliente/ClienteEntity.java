package com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {

    @Column(name = "CLIENTEID")
    @Id
    private Integer clienteId;

    @Column(name = "DNI")
    private Long dni;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "NOMBRE")
    private String nombre;
}
