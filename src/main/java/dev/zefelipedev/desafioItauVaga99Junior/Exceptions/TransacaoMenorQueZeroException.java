package dev.zefelipedev.desafioItauVaga99Junior.Exceptions;

public class TransacaoMenorQueZeroException extends RuntimeException{
    public TransacaoMenorQueZeroException() {super("A transação não pode ter um valor negativo.");}
}
