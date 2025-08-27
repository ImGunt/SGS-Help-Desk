package com.exemplo.sgs.repository;

import com.exemplo.sgs.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {}
