package com.exemplo.sgs.patterns.factory;

import com.exemplo.sgs.domain.Cliente;
import com.exemplo.sgs.domain.OrdemDeServico;

public class OrdemCorretivaFactory extends OrdemFactory {
    @Override
    public OrdemDeServico criar(Cliente cliente) {
        return new OrdemDeServico(null, "Corretiva", "Aberta", 0, 0.0, cliente, null, null);
    }
}
