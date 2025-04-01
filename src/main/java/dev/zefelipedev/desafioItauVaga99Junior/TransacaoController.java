package dev.zefelipedev.desafioItauVaga99Junior;

import dev.zefelipedev.desafioItauVaga99Junior.Models.TransacaoModel;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @GetMapping("/")
    public String bemVindo() {
        return "<h1>Bem Vindos, Examinadores do Itaú!</h1><h4>Esse é o meu projeto do desafio itaú</h4>";
    }

    @GetMapping("/transacoes")
    public ArrayList<TransacaoModel> getAllTransacoes() {
        return this.transacaoService.getAllTransacoes();
    }

    @PostMapping("/transacao")
    public ResponseEntity<Void> createTransacao(@Valid @RequestBody TransacaoModel transacao) {
        if(transacao.getValor() == null | transacao.getDataHora() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.transacaoService.createTransacao(transacao);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
