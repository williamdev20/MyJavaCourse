package com.william.mycursojava.aula35.hands_on;

public class Fibonacci {
    public static int calcularFibonacci(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return calcularFibonacci(n-1) + calcularFibonacci(n-2);
    }
}
