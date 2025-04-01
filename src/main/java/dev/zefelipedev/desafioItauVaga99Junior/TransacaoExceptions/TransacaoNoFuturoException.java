package dev.zefelipedev.desafioItauVaga99Junior.TransacaoExceptions;

public class TransacaoNoFuturoException extends RuntimeException {
    public TransacaoNoFuturoException() {super("A transação não pode ocorrer no futuro.");}
}
