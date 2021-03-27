package com.example.genius.domain.service;

import com.example.genius.domain.repository.PontuacaoRepository;
import com.example.genius.domain.model.Pontuacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PontuacaoService {

    @Autowired
    private PontuacaoRepository rep;

    public Iterable<Pontuacao> getPontuacoes() {
        return rep.findAll();
    }

}
