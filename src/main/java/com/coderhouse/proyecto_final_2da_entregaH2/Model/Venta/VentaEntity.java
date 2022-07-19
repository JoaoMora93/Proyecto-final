package com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta;

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
@Table(name = "VENTA")
public class VentaEntity {


    @Column(name = "VENTAID")
    @Id
    private Integer ventaId;

    @Column(name = "CLIENTEID")
    private Integer clienteId;

    @Column(name = "COMPRAID")
    private Integer compraId;

    @Column(name = "TOTALVENTA")
    private Float totalVenta;
}
