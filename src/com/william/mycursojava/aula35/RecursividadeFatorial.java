package com.william.mycursojava.aula35;

public class RecursividadeFatorial {

    public int calcularFatorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * calcularFatorial(num-1);
    }
}
