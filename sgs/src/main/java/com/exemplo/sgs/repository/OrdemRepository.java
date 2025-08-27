package com.exemplo.sgs.repository;

import com.exemplo.sgs.domain.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdemRepository extends JpaRepository<OrdemDeServico, Long> {
    List<OrdemDeServico> findByStatus(String status);
}
