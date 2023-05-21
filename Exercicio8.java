/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa:Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação. 
* Data: 18/05/2023
*/

import java.util.Scanner;

public class Exercicio8 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        int mes;
        
        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número referente ao mês requerente: ");
        mes = input.nextInt();
        System.out.println("");
        input.close();

        //Condição 
        switch(mes){
         case 1: System.out.println("Mês: Janeiro - Estação: Verão");
         break;
         case 2: System.out.println("Mes: Fevereiro - Estação: Verão");
         break;
         case 3: System.out.println("Mês: Março - Estação: Verão");
         break;
         case 4: System.out.println("Mês: Abril - Estação: Outono");
         break;
         case 5: System.out.println("Mês: Maio - Estação: Outono");
         break;
         case 6: System.out.println("Mês: Junho - Estação: Outono");
         break;
         case 7: System.out.println("Mês: Julho - Estação: Inverno");
         break;
         case 8: System.out.println("Mês: Agosto - Estação: Inverno");
         break;
         case 9: System.out.println("Mês: Setembro - Estação: Inverno");
         break;
         case 10: System.out.println("Mês: Outubro - Estação: Primavera");
         break;
         case 11: System.out.println("Mês: Novembro - Estação: Primavera");
         break;
         case 12: System.out.println("Mês: Dezembro - Estação: Primavera");
         break;
        }
    }   
}