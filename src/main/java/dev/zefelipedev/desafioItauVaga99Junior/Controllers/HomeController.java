package dev.zefelipedev.desafioItauVaga99Junior.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String bemVindo() {
        return "<h1>Bem Vindos, Examinadores do Itaú!</h1><h4>Esse é o meu projeto do desafio itaú</h4>";
    }

}
