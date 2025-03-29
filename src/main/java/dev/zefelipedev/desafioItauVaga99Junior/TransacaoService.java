package dev.zefelipedev.desafioItauVaga99Junior;


import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class TransacaoService {

    private ArrayList<TransacaoModel> transacoes = new ArrayList<>();

    public TransacaoModel createTransacao(TransacaoModel transacao) {
        this.transacoes.add(transacao);
        return transacao;
    }
}
