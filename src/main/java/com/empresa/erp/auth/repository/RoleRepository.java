package com.empresa.erp.auth.repository;

import com.empresa.erp.auth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, Long> {
}
