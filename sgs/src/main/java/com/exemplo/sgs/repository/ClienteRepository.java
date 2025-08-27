package com.exemplo.sgs.repository;

import com.exemplo.sgs.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
