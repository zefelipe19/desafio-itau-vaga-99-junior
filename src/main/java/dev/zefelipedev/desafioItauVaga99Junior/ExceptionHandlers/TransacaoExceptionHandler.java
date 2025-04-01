package dev.zefelipedev.desafioItauVaga99Junior.ExceptionHandlers;

import dev.zefelipedev.desafioItauVaga99Junior.Exceptions.TransacaoMenorQueZeroException;
import dev.zefelipedev.desafioItauVaga99Junior.Exceptions.TransacaoNoFuturoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TransacaoExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(TransacaoMenorQueZeroException.class)
    private ResponseEntity<String> TransacaoMenorQueZeroHandler(TransacaoMenorQueZeroException exception) {
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("A transação não pode ter valor negativo.");
    }

    @ExceptionHandler(TransacaoNoFuturoException.class)
    private ResponseEntity<String> TransacaoNoFuturo(TransacaoNoFuturoException exception) {
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("A transação não pode ser feita no futuro.");
    }
}
