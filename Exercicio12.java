/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que exiba todos os números pares a partir de 0 até
que encontre um múltiplo de 7 (utilize do/while)
* Data: 18/05/2023
*/


public class Exercicio12 
{    
    public static void main(String[] args) 
    {
        int numero = 0;
    
        do {
            numero += 2 ;
            if ( numero % 2 == 0){
                
                System.out.println(numero);
            }
        }while (numero % 7 != 0);

        System.out.printf("O Múltiplo par de 7 é %d.", numero);
    }
}