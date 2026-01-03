package com.empresa.erp.auth.repository;

import com.empresa.erp.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
