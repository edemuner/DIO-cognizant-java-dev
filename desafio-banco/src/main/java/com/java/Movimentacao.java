package com.java;
import java.time.LocalDateTime;

public class Movimentacao {

    private double valor;
    private LocalDateTime momento;
    private Conta conta;

    public Movimentacao(double valor, Conta conta) {
        this.valor = valor;
        this.conta = conta;
        momento = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
