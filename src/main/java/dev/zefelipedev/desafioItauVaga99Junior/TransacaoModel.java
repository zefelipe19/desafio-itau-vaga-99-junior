package dev.zefelipedev.desafioItauVaga99Junior;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Dictionary;

public class TransacaoModel {
    private Float valor;
    private DateTimeFormat dataHora;

    public TransacaoModel(){}

    public TransacaoModel(Float valor, DateTimeFormat dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Float getValor() {
        return this.valor;
    }

    public DateTimeFormat getDataHora() {
        return this.dataHora;
    }
}
