package com.coderhouse.proyecto_final_2da_entregaH2.Builder;

import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClienteBuilder {

    public static ClienteResponse entityToResponse(ClienteEntity cliente) {
        if (Objects.nonNull(cliente)) {
            return ClienteResponse.builder()
                    .clienteId(cliente.getClienteId())
                    .dni(cliente.getDni())
                    .apellido(cliente.getApellido())
                    .nombre(cliente.getNombre())
                    .build();
        }
        return null;
    }

    public static List<ClienteResponse> entityToResponseList(List<ClienteEntity> entityList) {
        return entityList.stream().map(ClienteBuilder::entityToResponse).collect(Collectors.toList());
    }

    public static ClienteEntity requestToEntity(ClienteRequest cliente) {
        if (Objects.nonNull(cliente)) {
            return ClienteEntity.builder()
                    .clienteId(cliente.getClienteId())
                    .dni(cliente.getDni())
                    .apellido(cliente.getApellido())
                    .nombre(cliente.getNombre())
                    .build();
        }
        return null;
    }
}
