package com.teste;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void somar() {
        Calculadora calc = new Calculadora();

        int soma = calc.somar("1+1+2");
        assertEquals(5, soma);
    }
}