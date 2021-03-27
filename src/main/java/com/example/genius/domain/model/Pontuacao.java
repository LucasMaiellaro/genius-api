package com.example.genius.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Pontuacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer pontuacaoAtingida;
    private Integer pontuacaoDigitada;
    private LocalDateTime dataHora;

    public Pontuacao(Long id, Integer pontuacaoAtingida, Integer pontuacaoDigitada, LocalDateTime dataHora) {
        this.id = id;
        this.pontuacaoAtingida = pontuacaoAtingida;
        this.pontuacaoDigitada = pontuacaoDigitada;
        this.dataHora = dataHora;
    }

    public Pontuacao() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPontuacaoAtingida() {
        return pontuacaoAtingida;
    }

    public void setPontuacaoAtingida(Integer pontuacaoAtingida) {
        this.pontuacaoAtingida = pontuacaoAtingida;
    }

    public Integer getPontuacaoDigitada() {
        return pontuacaoDigitada;
    }

    public void setPontuacaoDigitada(Integer pontuacaoDigitada) {
        this.pontuacaoDigitada = pontuacaoDigitada;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
