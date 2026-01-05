package com.empresa.erp.productos.Controller;


import com.empresa.erp.productos.Entity.Producto;
import com.empresa.erp.productos.Service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody Producto producto) {
        Producto creado = productoService.crearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    // ADMIN y USER
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping
    public List<Producto> listar() {
        return productoService.listar();
    }


}
