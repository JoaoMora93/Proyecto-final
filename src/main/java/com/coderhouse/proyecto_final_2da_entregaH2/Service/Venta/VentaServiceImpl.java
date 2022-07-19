package com.coderhouse.proyecto_final_2da_entregaH2.Service.Venta;


import com.coderhouse.proyecto_final_2da_entregaH2.Builder.VentaBuilder;
import com.coderhouse.proyecto_final_2da_entregaH2.DAO.VentaRepository;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VentaServiceImpl implements VentaService {

    private final VentaRepository ventaRepository;

    @Override
    public VentaResponse buscarPorId(Integer ventaId) {
        VentaEntity venta = ventaRepository.findById(ventaId).orElse(null);
        return VentaBuilder.entityToResponse(venta);
    }

    @Override
    public List<VentaResponse> buscarTodos() {
        return VentaBuilder.entityToResponseList(ventaRepository.findAll());
    }
}