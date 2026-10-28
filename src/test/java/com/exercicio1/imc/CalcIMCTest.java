package com.exercicio1.imc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    @Test
    void deveCalcularIMC() {
        CalcIMC calculadora = new CalcIMC();

        double resultado = calculadora.calcularIMC(70, 1.75);

        assertEquals(22.857142857, resultado, 0.000001);
    }

    @Test
    void deveRejeitarPesoZero() {
        CalcIMC calculadora = new CalcIMC();

        assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcularIMC(0, 1.75));
    }

    @Test
    void deveRejeitarAlturaZero() {
        CalcIMC calculadora = new CalcIMC();

        assertThrows(IllegalArgumentException.class,
                () -> calculadora.calcularIMC(70, 0));
    }
}