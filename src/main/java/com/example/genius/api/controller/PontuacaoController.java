package com.example.genius.api.controller;

import com.example.genius.domain.model.Pontuacao;
import com.example.genius.domain.service.PontuacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pontuacoes")
public class PontuacaoController {

    @Autowired
    private PontuacaoService service;

    @GetMapping
    public Iterable<Pontuacao> get() {
        return service.getPontuacoes();
    }

}
