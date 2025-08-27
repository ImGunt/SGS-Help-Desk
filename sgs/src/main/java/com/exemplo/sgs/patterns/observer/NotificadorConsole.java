package com.exemplo.sgs.patterns.observer;

import com.exemplo.sgs.domain.OrdemDeServico;

public class NotificadorConsole implements Observador {
    @Override
    public void atualizar(OrdemDeServico os) {
        System.out.println("OS " + os.getId() + " mudou status para: " + os.getStatus());
    }
}
