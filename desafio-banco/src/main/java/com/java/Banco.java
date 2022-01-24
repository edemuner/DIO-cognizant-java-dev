package com.java;

import java.util.LinkedList;
import java.util.List;

public class Banco {

    private String nome;
    private static List<Conta> contas = new LinkedList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void addConta(Conta conta){
        contas.add(conta);
    }
}
