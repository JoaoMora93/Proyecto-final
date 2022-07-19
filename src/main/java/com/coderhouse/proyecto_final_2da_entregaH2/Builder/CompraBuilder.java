package com.coderhouse.proyecto_final_2da_entregaH2.Builder;


import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CompraBuilder {

    public static CompraResponse entityToResponse(CompraEntity compra) {
        if (Objects.nonNull(compra)) {
            return CompraResponse.builder()
                    .compraId(compra.getCompraId())
                    .clienteId(compra.getClienteId())
                    .productoId(compra.getProductoId())
                    .fecha(compra.getFecha())
                    .total(compra.getTotal())
                    .build();
        }
        return null;
    }

    public static List<CompraResponse> entityToResponseList(List<CompraEntity> entityList) {
        return entityList.stream().map(CompraBuilder::entityToResponse).collect(Collectors.toList());
    }

    public static CompraEntity requestToEntity(CompraRequest compra) {
        if (Objects.nonNull(compra)) {
            return CompraEntity.builder()
                    .compraId(compra.getCompraId())
                    .clienteId(compra.getClienteId())
                    .productoId(compra.getProductoId())
                    .fecha(compra.getFecha())
                    .total(compra.getTotal())
                    .build();
        }
        return null;
    }
}
