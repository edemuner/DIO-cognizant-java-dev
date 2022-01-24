package com.java;
import java.time.format.DateTimeFormatter;
import java.util.*;

public abstract class Conta implements Iconta{

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo = 0d;
    private static int SEQUENCIAL = 1;
    private List<Movimentacao> movimentacoes;


    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        movimentacoes = new LinkedList<>();
        Banco.addConta(this);
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
        movimentacoes.add(new Movimentacao(valor, this, "Saque"));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        movimentacoes.add(new Movimentacao(valor, this, "Depósito"));

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        saldo -= valor;
        contaDestino.receberTransferencia(new Movimentacao(valor, contaDestino, "Transferência rec."));
        movimentacoes.add(new Movimentacao(valor, this, "Transferência env."));
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular : %s", cliente.getNome()));
        System.out.println(String.format("Agência : %d", agencia));
        System.out.println(String.format("Número : %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public void receberTransferencia(Movimentacao mov){
        movimentacoes.add(mov);
        saldo += mov.getValor();
    }

    public void imprimirExtratoDetalhado(){
        this.imprimirExtrato();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        for (Movimentacao mov : movimentacoes){
            System.out.println(mov.getTipo() + " " + mov.getValor() + " . . . " + mov.getMomento().format(myFormatObj));
        }
    }
}
