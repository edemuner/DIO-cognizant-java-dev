package com.java;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(new Cliente("Eduardo"));
        Conta cp = new ContaPoupanca(new Cliente("Alice"));

        cc.depositar(200);
        cp.depositar(300);

        cp.transferir(100, cc);

        cc.imprimirExtratoDetalhado();
        cp.imprimirExtratoDetalhado();

    }
}
