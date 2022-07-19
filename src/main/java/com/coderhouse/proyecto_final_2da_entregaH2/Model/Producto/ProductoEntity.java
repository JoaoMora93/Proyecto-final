package com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto;

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
@Table(name = "PRODUCTO")
public class ProductoEntity {

    @Column(name = "PRODUCTOID")
    @Id
    private Integer productoId;

    @Column(name = "CODIGO")
    private Integer codigo;

    @Column(name = "PRECIO")
    private Float precio;

    @Column(name = "CANTIDADPRODUCTO")
    private Integer cantidadProducto;

    @Column(name = "DESCRIPCION")
    private String descripcion;
}
