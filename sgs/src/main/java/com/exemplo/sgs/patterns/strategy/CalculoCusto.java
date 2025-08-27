package com.exemplo.sgs.patterns.strategy;

import com.exemplo.sgs.domain.OrdemDeServico;

public interface CalculoCusto {
    double calcular(OrdemDeServico os);
}
