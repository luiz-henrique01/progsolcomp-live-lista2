/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data: 17/05/2023
*/

import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
        //Declaração Variaveis 
        int a;
        int b;
       

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: " );
        a= input.nextInt();
        System.out.print("Informe outro número: " );
        b= input.nextInt();
        input.close();
        System.out.println("");
        
        //Condição

        if (a % b == 0 || b % a == 0){
            System.out.println("Os números são múltiplos");

        }
        else{
            System.out.println("Os números não são múltiplos");
        }
        
    }
    
}
