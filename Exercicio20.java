/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Exercicio20 
{
    public static void main(String[] args) 
    {
        //Declaração variavel 
        double cargaMaxima;
        int maximaPessoas; 
        double peso;
        int pessoas = 0;
        double cargaAtual = 0;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a carga máxima do elevador em KG: ");
        cargaMaxima = input.nextDouble();
        System.out.print("Informe a quantidade máxima de pessoas: ");
        maximaPessoas = input.nextInt();
        System.out.println("");
        input.close();

        //loop
        do{
            System.out.printf("Digite o peso da pessoa %d em KG: ", pessoas+1);
            peso = input.nextDouble();
            
            if(cargaAtual + peso > cargaMaxima){
              System.out.println("Carga Máxima atingida");
              break;
            }

            cargaAtual = cargaAtual + peso;
            pessoas = pessoas +1;
        } 
        while (pessoas < maximaPessoas);

        //Resultado
        System.out.printf("O elevador está com %.2f Kg de carga e %d de pessoas", cargaAtual, pessoas);     
    }    
}