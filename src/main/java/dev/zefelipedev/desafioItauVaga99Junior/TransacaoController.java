package dev.zefelipedev.desafioItauVaga99Junior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @GetMapping("/")
    public String bemVindo() {
        return "<h1>Bem Vindos, Examinadores do Itaú!</h1><h4>Esse é o meu projeto do desafio itaú</h4>";
    }

    @PostMapping("/transacao")
    public TransacaoModel createTransacao(@RequestBody TransacaoModel transacao) {
        return this.transacaoService.createTransacao(transacao);
    }
}
