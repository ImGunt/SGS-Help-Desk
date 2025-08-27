package com.exemplo.sgs.patterns.strategy;

import com.exemplo.sgs.domain.OrdemDeServico;

public class CustoPorHora implements CalculoCusto {
    @Override
    public double calcular(OrdemDeServico os) {
        return os.getHoras() * 50.0;
    }
}
