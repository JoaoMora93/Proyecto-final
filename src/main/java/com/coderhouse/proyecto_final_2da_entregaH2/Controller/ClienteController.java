package com.coderhouse.proyecto_final_2da_entregaH2.Controller;

import com.coderhouse.proyecto_final_2da_entregaH2.Handle.ApiException;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteRequest;
import com.coderhouse.proyecto_final_2da_entregaH2.Model.Cliente.ClienteResponse;
import com.coderhouse.proyecto_final_2da_entregaH2.Service.Cliente.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<ClienteResponse>> obtenerClientes() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{clienteId}")
    public ResponseEntity<ClienteResponse> buscarClientePorId(@PathVariable Integer clienteId) {
        return ResponseEntity.ok(clienteService.buscarPorId(clienteId));
    }

    @PostMapping("/actualizar")
    public ResponseEntity<ClienteResponse> actualizarCliente(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        return ResponseEntity.ok(clienteService.actualizar(cliente));
    }

    @PostMapping("/crear")
    public ResponseEntity<ClienteResponse> crearCliente(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        return ResponseEntity.ok(clienteService.crear(cliente));
    }
}
