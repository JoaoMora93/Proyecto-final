package com.coderhouse.proyecto_final_2da_entregaH2.Service.Producto;


import com.coderhouse.proyecto_final_2da_entregaH2.Builder.ProductoBuilder;
import com.coderhouse.proyecto_final_2da_entregaH2.DAO.ProductoRepository;
import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;

import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoEntity;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public ProductoResponse buscarPorId(Integer productoId) {
        ProductoEntity producto = productoRepository.findById(productoId).orElse(null);
        return ProductoBuilder.entityToResponse(producto);
    }

    @Override
    public List<ProductoResponse> buscarTodos() {
        return ProductoBuilder.entityToResponseList(productoRepository.findAll());
    }

    @Override
    public ProductoResponse crear(ProductoRequest producto) throws ApiException {
        try {
            if (buscarPorId(producto.getProductoId()) == null) {
                ProductoEntity entity = productoRepository.save(ProductoBuilder.requestToEntity(producto));
                return ProductoBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("El producto ya existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public ProductoResponse actualizar(ProductoRequest producto) throws ApiException {
        try {
            if (buscarPorId(producto.getProductoId()) != null) {
                ProductoEntity entity = productoRepository.save(ProductoBuilder.requestToEntity(producto));
                return ProductoBuilder.entityToResponse(entity);
            } else {
                throw new ApiException("El producto no existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }
}