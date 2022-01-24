package com.java;
import java.time.LocalDate;

public class Movimentacao {

    private double valor;
    private LocalDate momento;
    private Conta conta;

    public Movimentacao(double valor, Conta conta) {
        this.valor = valor;
        this.conta = conta;
        momento = LocalDate.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getMomento() {
        return momento;
    }

    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
