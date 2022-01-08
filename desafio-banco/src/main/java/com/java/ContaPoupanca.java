package com.java;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato com.java.Conta Poupança ***");
        super.imprimirInfosComuns();
    }
}
