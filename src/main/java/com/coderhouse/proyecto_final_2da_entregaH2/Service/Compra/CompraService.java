package com.coderhouse.proyecto_final_2da_entregaH2.Service.Compra;


import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraResponse;

import java.util.List;

public interface CompraService {
    CompraResponse buscarPorId(Integer compraId);
    List<CompraResponse> buscarTodos();
}
