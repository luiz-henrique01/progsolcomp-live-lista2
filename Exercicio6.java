/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa:Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data: 17/05/2023
*/

import java.util.Scanner;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        double nota;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a nota do aluno (0 a 100): ");
        nota = input.nextDouble();
        input.close();

        //Condições 

        if (nota <= 49){
            System.out.println("O conceito do aluno é: Insuficiente");
        }
        else if(nota <= 64){
            System.out.println("O conceito do aluno é: Regular");
        }
        else if(nota <= 84){
            System.out.println("O conceito do aluno é: Bom");
        }
        else{System.out.println("O conceito do aluno é: Otimo");}
    }   
}