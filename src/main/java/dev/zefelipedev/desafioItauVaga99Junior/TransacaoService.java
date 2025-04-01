package dev.zefelipedev.desafioItauVaga99Junior;


import dev.zefelipedev.desafioItauVaga99Junior.Models.TransacaoModel;
import dev.zefelipedev.desafioItauVaga99Junior.TransacaoExceptions.TransacaoMenorQueZeroException;
import dev.zefelipedev.desafioItauVaga99Junior.TransacaoExceptions.TransacaoNoFuturoException;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;

@Service
public class TransacaoService {

    private ArrayList<TransacaoModel> transacoes = new ArrayList<>();

    public TransacaoModel createTransacao(TransacaoModel transacao) {
        if (transacao.getValor() < 0) {
            throw new TransacaoMenorQueZeroException();
        } else if (transacao.getDataHora().isAfter(ZonedDateTime.now())) {
            throw new TransacaoNoFuturoException();
        }
        this.transacoes.add(transacao);
        return transacao;
    }

    public void clearTransacao() {
        this.transacoes.clear();
    }

    public ArrayList<TransacaoModel> getAllTransacoes() {
        return this.transacoes;
    }
}
