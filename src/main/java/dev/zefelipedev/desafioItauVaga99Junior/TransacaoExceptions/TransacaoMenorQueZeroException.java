package dev.zefelipedev.desafioItauVaga99Junior.TransacaoExceptions;

public class TransacaoMenorQueZeroException extends RuntimeException{
    public TransacaoMenorQueZeroException() {super("A transação não pode ter um valor negativo.");}
}
