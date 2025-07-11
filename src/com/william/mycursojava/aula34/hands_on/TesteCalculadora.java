package com.william.mycursojava.aula34.hands_on;

public class TesteCalculadora {
    public static void main(String[] args) {
        System.out.println("Soma: "+ Calculadora.somar(2, 2));
        System.out.println("Subtração: "+ Calculadora.subtrair(5, 2));
        System.out.println("Multiplicação: "+ Calculadora.multiplicar(3, 5));
        System.out.println("Divisão: "+ Calculadora.dividir(15, 3));
        System.out.println("Potência: "+ Calculadora.elevarPotencia(9, 2));
        System.out.println("Fatorial: "+ Calculadora.calcularFatorial(5));
    }
}
