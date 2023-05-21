/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa: Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem 
crescente.
* Data: 17/05/2023
*/


import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    // Declaração Variavel
    int a;
    int b;
    int c;

    // Entrada de dados
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o primeiro número: ");
    a = input.nextInt();
    System.out.println("");
    System.out.print("Informe o segundo número: ");
    b = input.nextInt();
    System.out.println("");
    System.out.print("Digite o terceiro número ");
    c = input.nextInt();
    System.out.println("");
    input.close();

    // Condições
    if (a <= b && b <= c) {
      System.out.printf("A ordem crescente dos números informados são: %d - %d - %d ", a, b, c);
    } else if (a <= c && c <= b) {
      System.out.printf("A ordem crescente dos números informados são: %d - %d - %d ", a, c, b);
    } else if (b <= a && a <= c) {
      System.out.printf("A ordem crescente dos números informados são: %d - %d - %d ", b, a, c);
    } else if (b <= c && c <= a) {
      System.out.printf("A ordem crescente dos números informados são: %d - %d - %d ", b, c, a);
    } else if (c <= a && a <= b) {
      System.out.printf("A ordem crescente dos números informados são: %d - %d - %d ", c, a, b);
    } else if (c <= b && b <= a) {
      System.out.printf("A ordem crescente dos números informados são: %d - %d - %d ", c, b, a);
    }
  }
}