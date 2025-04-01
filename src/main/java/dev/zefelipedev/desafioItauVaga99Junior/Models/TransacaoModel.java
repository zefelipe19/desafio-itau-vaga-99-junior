package dev.zefelipedev.desafioItauVaga99Junior;


import java.time.ZonedDateTime;

public class TransacaoModel {
    private Float valor;
    private ZonedDateTime dataHora;

    public TransacaoModel(){}

    public TransacaoModel(Float valor, String dataHora) {
        this.valor = valor;
        this.dataHora = ZonedDateTime.parse(dataHora);
    }

    public Float getValor() {
        return this.valor;
    }

    public ZonedDateTime getDataHora() {
        return this.dataHora;
    }
}
