package com.exemplo.sgs.patterns.observer;

import com.exemplo.sgs.domain.OrdemDeServico;

public interface Observador {
    void atualizar(OrdemDeServico os);
}
