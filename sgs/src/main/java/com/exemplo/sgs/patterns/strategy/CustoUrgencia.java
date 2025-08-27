package com.exemplo.sgs.patterns.strategy;

import com.exemplo.sgs.domain.OrdemDeServico;

public class CustoUrgencia implements CalculoCusto {
    @Override
    public double calcular(OrdemDeServico os) {
        return (os.getHoras() * 70.0) + 100.0;
    }
}
