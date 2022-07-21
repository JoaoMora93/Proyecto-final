package com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "COMPRA")
public class CompraEntity {


    @Column(name = "COMPRAID")
    @Id
    private Integer compraId;

    @Column(name = "CLIENTEID")
    private Integer clienteId;

    @Column(name = "PRODUCTOID")
    private Integer productoId;

    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "TOTAL")
    private Float total;
}
