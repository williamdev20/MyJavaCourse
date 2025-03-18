package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class AumentoSalarial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o salário de um funcionário: R$ ");
    double salario = scan.nextDouble();
    double percentual = 1.5;
    double aumento = (salario * percentual) / 100;
    System.out.printf(
        "Suponha que esse foi o inicio salarial desse funcionário, iniciando em 1995. Em 1996, ele teve um aumento de 1,5%%, saindo de R$%.2f para R$%.2f. A partir de 1997, esse percentual será dobrado anualmente. Informe em qual ano estamos agora e veja o atual salário deste trabalhador! ",
        salario, (salario + aumento));

    int ano = scan.nextInt();

    for (int i = 1997; i <= ano; i++) {
      percentual *= 2;
      aumento = (salario * percentual) / 100;
      System.out.printf("\nSalário do funcionário em %d: R$%.2f", i, (salario + aumento));
    }

    System.out.printf("O atual salário deste trabalhador de bem é de R$%.2f.", (salario + aumento));
    scan.close();
  }
}
