/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa: Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
* Data: 18/05/2023
*/

import java.util.Scanner;


public class Exercicio9 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        double valorVenda;
        double total;
        int condicao;
       

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor da venda: R$");
        valorVenda = input.nextDouble();
        
        System.out.println("Escolha uma das opções abaixo " );
        System.out.println("1 - Venda a vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de Débito");
        System.out.println("6 - venda com cartão de Crédito");
        condicao = input.nextInt();
        System.out.println("Opção desejada: "+ condicao);
        input.close();

        //Condição
        
        switch(condicao){
         case 1: total = valorVenda * 0.9;
         break;
         case 2: total = valorVenda * 0.95;
         break;
         case 3: total = valorVenda;
         break;
         case 4: total = valorVenda * 1.05;
         break;
         case 5: total = valorVenda * 0.92;
         break;
         case 6: total = valorVenda * 0.93;
         default:
         System.out.println("Opção inválida");
         return;
        }

        //Resultado
        System.out.println("Total da venda: R$" +total);      
    } 
}