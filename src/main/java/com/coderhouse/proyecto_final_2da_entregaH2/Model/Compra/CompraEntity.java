package com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra;

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
public class CompraEntity {

    @Column(name = "CLIENTEID")
    @Id
    private Integer clienteId;

    @Column(name = "DNI")
    private long dni;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;
}