/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Exercicio21 
{
    public static void main(String[] args) 
    {
        //Declaração variavel
        int numero; 
        int i= 1;
        int resultado;
        int j = 1;
        
        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número positivo: " );
        numero = input.nextInt();
        input.close();
        
        //Condições
        for (i = 1; i <= numero; i++) {
         System.out.println("Tabuada do número " + i + " : ");
        
        for(j = 1; j <= 10; j++){
            resultado = i * j;
         System.out.println(i + " x " + j + " = " + resultado );
        }   
      }      
    }    
}
    

