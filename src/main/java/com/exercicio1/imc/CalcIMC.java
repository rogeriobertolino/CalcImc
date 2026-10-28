package com.exercicio1.imc;

public class CalcIMC {

    public double calcularIMC(double peso, double altura) {
        if (!Double.isFinite(peso) || !Double.isFinite(altura)
                || peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException(
                    "Peso e altura devem ser maiores que zero.");
        }

        return peso / (altura * altura);
    }
}