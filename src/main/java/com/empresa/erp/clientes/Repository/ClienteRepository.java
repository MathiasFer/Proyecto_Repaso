package com.empresa.erp.clientes.Repository;

import com.empresa.erp.clientes.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
