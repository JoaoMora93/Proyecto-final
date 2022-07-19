package com.coderhouse.proyecto_final_2da_entregaH2.Service.Cliente;

import com.coderhouse.proyecto_final_2da_entregaH2.Builder.ClienteBuilder;
import com.coderhouse.proyecto_final_2da_entregaH2.DAO.ClienteRepository;
import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse buscarPorId(Integer clienteId) {
        ClienteEntity cliente = clienteRepository.findById(clienteId).orElse(null);
        return ClienteBuilder.entityToResponse(cliente);
    }

    @Override
    public List<ClienteResponse> buscarTodos() {
        return ClienteBuilder.entityToResponseList(clienteRepository.findAll());
    }

    @Override
    public ClienteResponse crear(ClienteRequest cliente) throws ApiException {
        try {
            if (buscarPorId(cliente.getClienteId()) == null) {
                ClienteEntity entity = clienteRepository.save(ClienteBuilder.requestToEntity(cliente));
                return ClienteBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("Cliente ya existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public ClienteResponse actualizar(ClienteRequest cliente) throws ApiException {
        try {
            if (buscarPorId(cliente.getClienteId()) != null) {
                ClienteEntity entity = clienteRepository.save(ClienteBuilder.requestToEntity(cliente));
                return ClienteBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("Cliente no existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }
}