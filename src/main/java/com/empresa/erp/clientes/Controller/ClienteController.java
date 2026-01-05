package com.empresa.erp.clientes.Controller;

import com.empresa.erp.clientes.Entity.Cliente;
import com.empresa.erp.clientes.Service.ClienteService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    //SOLO LECTURA → ADMIN y USER @´reAuthorize primero autentica, luego autoriza
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public List<Cliente> listar() {
        return clienteService.listarTodos();
    }

    // CREAR → SOLO ADMIN
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Cliente crear(@RequestBody Cliente cliente) {
        return clienteService.guardar(cliente);
    }

    // ELIMINAR → SOLO ADMIN
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void eliminar(@PathVariable Long id) {
        clienteService.eliminar(id);
    }

}
