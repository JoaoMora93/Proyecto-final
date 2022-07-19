package com.coderhouse.proyecto_final_2da_entregaH2.Builder;

import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VentaBuilder {

    public static VentaResponse entityToResponse(VentaEntity venta) {
        if (Objects.nonNull(venta)) {
            return VentaResponse.builder()
                    .ventaId(venta.getVentaId())
                    .clienteId(venta.getClienteId())
                    .compraId(venta.getCompraId())
                    .totalVenta(venta.getTotalVenta())
                    .build();
        }
        return null;
    }

    public static List<VentaResponse> entityToResponseList(List<VentaEntity> entityList) {
        return entityList.stream().map(VentaBuilder::entityToResponse).collect(Collectors.toList());
    }

    public static VentaEntity requestToEntity(VentaRequest venta) {
        if (Objects.nonNull(venta)) {
            return VentaEntity.builder()
                    .ventaId(venta.getVentaId())
                    .clienteId(venta.getClienteId())
                    .compraId(venta.getCompraId())
                    .totalVenta(venta.getTotalVenta())
                    .build();
        }
        return null;
    }
}
