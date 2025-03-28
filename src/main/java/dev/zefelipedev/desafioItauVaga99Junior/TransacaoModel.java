package dev.zefelipedev.desafioItauVaga99Junior;

import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

public class TransacaoModel {
    private Float valor;
    private ZonedDateTime dataHora;

    public TransacaoModel(){}

    public TransacaoModel(Float valor, String dataHora) {
        this.valor = valor;
        this.dataHora = ZonedDateTime.parse("2020-08-07T12:34:56.789-03:00");
    }

    public Float getValor() {
        return this.valor;
    }

    public ZonedDateTime getDataHora() {
        return this.dataHora;
    }
}
