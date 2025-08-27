package com.exemplo.sgs.controller;

import com.exemplo.sgs.domain.Cliente;
import com.exemplo.sgs.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repo;

    public ClienteController(ClienteRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente c) {
        return repo.save(c);
    }
}
