package dev.zefelipedev.desafioItauVaga99Junior;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransacaoController {

    public String bemVindo() {
        return "<h1>Bem Vindo!</h1><h2>Esse é o meu projeto do desafio itaú</h2>";
    }
}
