package com.exercicio1.imc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Calculadora de IMC ===");

            System.out.print("Digite o peso em kg: ");
            double peso = Double.parseDouble(
                    scanner.nextLine().trim().replace(',', '.'));

            System.out.print("Digite a altura em metros (ex.: 1,75): ");
            double altura = Double.parseDouble(
                    scanner.nextLine().trim().replace(',', '.'));

            CalcIMC calculadora = new CalcIMC();
            double imc = calculadora.calcularIMC(peso, altura);

            System.out.printf("Seu IMC é: %.2f%n", imc);

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Entrada inválida. Informe peso e altura com números maiores que zero.");
        }
    }
}