/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos. (utilize while)
* Data: 20/05/2023
*/

import java.util.Scanner; 

public class Exercicio19 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        double volume;
        int segundos = 0;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o volume inicial do gás em CM³: ");
        volume = input.nextInt();
        input.close();

        //loop
        while(volume <= 1000){
            volume = volume * 2;
            segundos = segundos + 1;
        }
        //Resultado
        System.out.printf("O volume ultrapassou 1000 cm³ em %d segundos", segundos);        
    }    
}