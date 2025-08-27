package com.exemplo.sgs.domain;

import com.exemplo.sgs.patterns.observer.Observador;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdemDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String status;
    private int horas;
    private double custo;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Tecnico tecnico;

    @Transient
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void mudarStatus(String novoStatus) {
        this.status = novoStatus;
        notificar();
    }

    private void notificar() {
        observadores.forEach(obs -> obs.atualizar(this));
    }
}
