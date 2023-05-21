/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
* Data: 19/05/2023
*/

import java.util.Scanner;

public class Exercicio16 
{
    public static void main(String[] args) 
    {   //Declaração variavel
        int numero;

        //loop
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Informe um número: ");
            numero = input.nextInt();
        }
        while (numero>=0);
        input.close();
        
        //Resultado
        System.out.println("Número informado é menor que 0"); 
    } 
}