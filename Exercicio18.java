/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Exercicio18 
{
    public static void main(String[] args) 
  {
    //Declaração Variavel 
    int fatorial = 1;
    int i; 
    int numero;

    //Entrada de dados
    Scanner input = new Scanner(System.in);
    System.out.print("Informe um número: ");
    numero = input.nextInt();
    input.close();
    
    //loop
    for(i = 1; i <= numero ; i = i + 1){
    fatorial *= i; 
    }
   
    //Resultado
    System.out.printf("%d! = %d", numero, fatorial);
  }

}