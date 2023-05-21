/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que imprima todos os números pares de 1 a 100
* Data: 18/05/2023
*/

public class Exercicio10 
{
 public static void main(String[] args) 
    {
        // Declaração Variavel
        int i = 1;
    
        // Entrada de dados
        while (i <= 100) {
          i++;
          if (i % 2 == 0)
          //Resultado
          System.out.println(i);
        }
    }
}