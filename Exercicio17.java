/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)
* Data: 19/05/2023
*/


public class Exercicio17 
{
    public static void main(String[] args) 
    {
        int i = 0;

        do{
            i--;
            if(i % 7 == 0){
                System.out.print(i + " ");
            }

        }while(i < 0 && i > -1000);
    }
    
}
