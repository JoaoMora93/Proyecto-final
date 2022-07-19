package com.coderhouse.proyecto_final_2da_entregaH2.Service.Venta;


import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaResponse;

import java.util.List;

public interface VentaService {

    VentaResponse buscarPorId(Integer ventaId);
    List<VentaResponse> buscarTodos();
}