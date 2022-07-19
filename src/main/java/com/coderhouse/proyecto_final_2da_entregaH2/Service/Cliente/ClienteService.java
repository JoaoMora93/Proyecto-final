package com.coderhouse.proyecto_final_2da_entregaH2.Service.Cliente;

import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteResponse;

import java.util.List;

public interface ClienteService {

    ClienteResponse buscarPorId(Integer clienteId);
    List<ClienteResponse> buscarTodos();
    ClienteResponse crear(ClienteRequest cliente) throws ApiException;
    ClienteResponse actualizar(ClienteRequest cliente) throws ApiException;
}
