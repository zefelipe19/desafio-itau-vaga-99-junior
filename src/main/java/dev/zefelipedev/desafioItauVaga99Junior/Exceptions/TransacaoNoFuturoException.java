package dev.zefelipedev.desafioItauVaga99Junior.Exceptions;

public class TransacaoNoFuturoException extends RuntimeException {
    public TransacaoNoFuturoException() {super("A transação não pode ocorrer no futuro.");}
}
