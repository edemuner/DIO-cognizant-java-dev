package com.java;
import java.time.LocalDateTime;

public class Movimentacao {

    private double valor;
    private LocalDateTime momento;
    private Conta conta;
    private String tipo;

    public Movimentacao(double valor, Conta conta, String tipo) {
        this.valor = valor;
        this.conta = conta;
        momento = LocalDateTime.now();
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
