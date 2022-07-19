package com.coderhouse.proyecto_final_2da_entregaH2.Service.Compra;


import com.coderhouse.proyecto_final_2da_entregaH2.Builder.CompraBuilder;
import com.coderhouse.proyecto_final_2da_entregaH2.DAO.CompraRepository;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompraServiceImpl implements CompraService {

    private final CompraRepository compraRepository;

    @Override
    public CompraResponse buscarPorId(Integer compraId) {
        CompraEntity compra = compraRepository.findById(compraId).orElse(null);
        return CompraBuilder.entityToResponse(compra);
    }

    @Override
    public List<CompraResponse> buscarTodos() {
        return CompraBuilder.entityToResponseList(compraRepository.findAll());
    }
}