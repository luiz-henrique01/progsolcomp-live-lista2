/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior deles.
* Data: 17/05/2023
*/

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    // Declaração Variavel
    double A;
    double B;

    // Entrada de dados
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o primeiro número: ");
    A = input.nextDouble();
    System.out.println("");
    System.out.print("Informe o segundo número: ");
    B = input.nextDouble();
    input.close();

    // Condições
    if (A > B) {
      System.out.println("");
      System.out.print( "O maior número entre os números informados é: " + A);
    } else if (B > A) {
      System.out.println("");
      System.out.print( "O maior número entre os números informados é: " + B);
    }
      else {
        System.out.println("");
        System.out.print( "Os números informados são iguais");
    }
  }
}