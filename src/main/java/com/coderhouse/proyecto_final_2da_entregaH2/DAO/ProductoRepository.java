package com.coderhouse.proyecto_final_2da_entregaH2.DAO;

import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

}