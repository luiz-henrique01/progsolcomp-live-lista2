/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa: Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.
* Data: 17/05/2023
*/

import java.util.Scanner;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        int numeroInteiro;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        numeroInteiro = input.nextInt();
        input.close();

        //Condições

        if (numeroInteiro % 2 == 0){
            System.out.println("");
            System.out.println("O número informado é Par");
        }
        else {System.out.println("O número informado é Impar"); 
        }

        if (numeroInteiro >= 0){
            System.out.println("O número informado é Positivo");
        }
        else {System.out.println("O número informado é Negativo");
        }        
    }    
}