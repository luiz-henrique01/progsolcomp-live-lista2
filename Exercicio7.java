/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa:Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
* Data: 18/05/2023
*/

import java.util.Scanner;

public class Exercicio7 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        double totalDiaria;
        double diaria = 60;
        double taxaServico;
        double total;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o total da diária: ");
        totalDiaria = input.nextDouble();
        System.out.println("");
        input.close();

        //Condição 
        if (totalDiaria > 15){
           taxaServico = 5.50;
            
        }
        else if (totalDiaria == 15){
           taxaServico = 6;
        }
        else{
            taxaServico = 8;
        }

        //Resultado
        total = totalDiaria * (diaria + taxaServico);
        System.out.println("O valor total da hospedagem é: R$" +total);
    }     
}