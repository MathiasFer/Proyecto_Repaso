package com.empresa.erp.productos.Repository;

import com.empresa.erp.productos.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
