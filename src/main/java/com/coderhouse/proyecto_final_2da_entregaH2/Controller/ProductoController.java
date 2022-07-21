package com.coderhouse.proyecto_final_2da_entregaH2.Controller;

import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoResponse;
import com.coderhouse.proyecto_final_2da_entregaH2.Service.Producto.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping()
    public ResponseEntity<List<ProductoResponse>> obtenerProductos() {
        return ResponseEntity.ok(productoService.buscarTodos());
    }

    @GetMapping("/{Id}")
    public ResponseEntity<ProductoResponse> buscarProductoPorId(@PathVariable Integer productoId) {
        return ResponseEntity.ok(productoService.buscarPorId(productoId));
    }

    @PostMapping("/actualizar")
    public ResponseEntity<ProductoResponse> actualizarCliente(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        return ResponseEntity.ok(productoService.actualizar(producto));
    }

    @PostMapping("/crear")
    public ResponseEntity<ProductoResponse> crearProducto(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        return ResponseEntity.ok(productoService.crear(producto));
    }
}
