/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa
* Data: 18/05/2023
*/


public class Exercicio11 
{
    public static void main(String[] args) 
    {
        // Declaração Variavel
        int i = 100;
    
        // Entrada de dados
        while (i > 1) {
          i--;
          if (i % 2 == 0)
          //Resultado
          System.out.println(i);
        }
    }    
}