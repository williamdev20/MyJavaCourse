package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class TabuadaDefinida {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número que desejas ver a tabuada: ");
    int num = scan.nextInt();
    System.out.print("Agora informe de qual número a tabuada deve começar: ");
    int numIni = scan.nextInt();
    System.out.print("Por fim, informe onde a tabuada deve terminar: ");
    int numFim = scan.nextInt();

    for (int i = numIni; i <= numFim; i++) {
      System.out.println(i + " . " + num + " = " + (num * i));
    }

    scan.close();
  }
}
