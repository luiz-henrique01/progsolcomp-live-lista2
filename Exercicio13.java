/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma
* Data: 18/05/2023
*/


public class Exercicio13
{
    public static void main(String[] args)
    {  
     //Declaração Variavel
     int i = 1;
     int soma=0;

     //loop
        while (i <= 100){
        soma = i + soma;
        i= i + 1;
        }
     
     //Resultado
     System.out.print(soma);

    }
}