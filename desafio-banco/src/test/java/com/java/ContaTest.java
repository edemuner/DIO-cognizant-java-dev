package com.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ContaTest {


    @Test
    void SaqueCasoInsuficienteNaoAlterarSaldo() {

        Cliente cliente = new Cliente("Tester");
        Conta conta = new ContaCorrente(cliente);
        double saldoAntes = conta.getSaldo();

        conta.sacar(1);
        double saldoDepois = conta.getSaldo();
        Assertions.assertEquals(saldoAntes, saldoDepois);

    }
}

