package com.coderhouse.proyecto_final_2da_entregaH2.Controller;

import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Compra.CompraResponse;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Producto.ProductoResponse;
import com.coderhouse.proyecto_final_2da_entregaH2.Service.Compra.CompraService;
import com.coderhouse.proyecto_final_2da_entregaH2.Service.Producto.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/compras")
public class CompraController {

    private final CompraService compraService;

    @GetMapping()
    public ResponseEntity<List<CompraResponse>> obtenerCompras() {
        return ResponseEntity.ok(compraService.buscarTodos());
    }

    @GetMapping("/{compraId}")
    public ResponseEntity<CompraResponse> buscarCompraPorId(@PathVariable Integer compraId) {
        return ResponseEntity.ok(compraService.buscarPorId(compraId));
    }
}