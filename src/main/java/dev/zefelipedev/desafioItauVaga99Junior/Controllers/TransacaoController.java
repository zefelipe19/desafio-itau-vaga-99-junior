package dev.zefelipedev.desafioItauVaga99Junior.Controllers;

import dev.zefelipedev.desafioItauVaga99Junior.Models.TransacaoModel;
import dev.zefelipedev.desafioItauVaga99Junior.Services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @GetMapping("/transacoes")
    public ArrayList<TransacaoModel> getAllTransacoes() {
        return this.transacaoService.getAllTransacoes();
    }

    @PostMapping
    public ResponseEntity<Void> createTransacao(@RequestBody TransacaoModel transacao) {
        if(transacao.getValor() == null | transacao.getDataHora() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.transacaoService.createTransacao(transacao);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> limparTransacao() {
        this.transacaoService.clearTransacao();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
