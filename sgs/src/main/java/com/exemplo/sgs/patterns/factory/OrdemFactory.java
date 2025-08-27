package com.exemplo.sgs.patterns.factory;

import com.exemplo.sgs.domain.Cliente;
import com.exemplo.sgs.domain.OrdemDeServico;

public abstract class OrdemFactory {
    public abstract OrdemDeServico criar(Cliente cliente);
}
