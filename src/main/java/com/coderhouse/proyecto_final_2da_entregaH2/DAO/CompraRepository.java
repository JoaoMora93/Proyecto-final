package com.coderhouse.proyecto_final_2da_entregaH2.DAO;

import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<CompraEntity, Integer> {

}
