/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa:Faça um programa que preencha com zeros todas as posições de
um vetor de tamanho 50 
* Data: 18/05/2023
*/


public class Exercicio14 
{
    public static void main(String[] args) 
    {
        //Declaração variavel
        int[] vetor = new int[50];
        
        //loop
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = 0;
        }
        
        //Resultado
        System.out.println("Vetores preenchidos com zeros: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }       
    }    
}