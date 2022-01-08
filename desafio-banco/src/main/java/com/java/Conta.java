package com.java;
import java.util.Date;
import java.util.*;

public abstract class Conta implements Iconta{

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo = 0d;
    private static int SEQUENCIAL = 1;
    private List<Map.Entry<String, Double>> movimentacoes = new ArrayList<Map.Entry<String, Double>>();


    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
//            String dateToStr = new Date().toString("yyyy-MM-dd HH:mm:SS")};
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular : %s", cliente.getNome()));
        System.out.println(String.format("Agência : %d", agencia));
        System.out.println(String.format("Número : %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
