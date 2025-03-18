package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escreva as duas notas para 10 alunos!");
        
    double[] nota1 = new double[10];
    double[] nota2 = new double[10];
    double[] result = new double[10];
    double media = 0;
    
    for (int i = 0; i < nota1.length; i++) {
      System.out.printf("Digite a 1º nota do aluno %d ", (i+1));
      nota1[i] = scan.nextDouble();
    }
    
    System.out.println("Agora, vamos para a segunda nota!");
    
    for (int i = 0; i < nota2.length; i++) {
      System.out.printf("Digite a 2º nota do aluno %d ", (i+1));
      nota2[i] = scan.nextDouble();
    }
    
    for (int i = 0; i < nota1.length; i++) {
      media = (nota1[i] + nota2[i]) / 2;
      result[i] = media;
      System.out.printf("A media do aluno %d é %.1f \n", (i+1), media);
      if (media >= 7) {
        System.out.printf("O aluno %d foi Aprovado!", (i+1));
      } else {
        System.out.printf("O aluno %d, infelizmente, foi Reprovado!", (i+1));
      }
    }
    
    
    scan.close();
  }
}
