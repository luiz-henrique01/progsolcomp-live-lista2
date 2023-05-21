/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA: 323118606
* Nome do Programa: Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas
* Data: 19/05/2023
*/


public class Exercicio15 
{
    public static void main(String[] args) 
    {
        //Declaração variavel
        int[][] matriz = new int[10][10];
        
        //loop
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;
            }
        }
        
        //Resultado
        System.out.println("Matriz preenchida com zeros:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}