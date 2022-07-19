package com.coderhouse.proyecto_final_2da_entregaH2.Service.Producto;

import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoResponse;

import java.util.List;

public interface ProductoService {

    ProductoResponse buscarPorId(Integer productoId);
    List<ProductoResponse> buscarTodos();
    ProductoResponse crear(ProductoRequest producto) throws ApiException;
    ProductoResponse actualizar(ProductoRequest producto) throws ApiException;
}