package com.coderhouse.proyecto_final_2da_entregaH2.Controller;

import com.coderhouse.proyecto_final_2da_entregaH2.Model.Venta.VentaResponse;
import com.coderhouse.proyecto_final_2da_entregaH2.Service.Venta.VentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    @GetMapping()
    public ResponseEntity<List<VentaResponse>> obtenerVentas() {
        return ResponseEntity.ok(ventaService.buscarTodos());
    }

    @GetMapping("/venta{Id}")
    public ResponseEntity<VentaResponse> buscarVentaPorId(@PathVariable Integer ventaId) {
        return ResponseEntity.ok(ventaService.buscarPorId(ventaId));
    }
}