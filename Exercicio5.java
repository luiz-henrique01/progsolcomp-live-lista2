/* Nome do Aluno: Luiz Henrique Fernandes do Carmo
* RA:323118606
* Nome do Programa: . Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de 
uma pessoa. Depois, o programa deve dar a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa deve imprimir “Digitação errada. Tente Novamente”.
* Data: 17/05/2023
*/

import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
        //Declaração Variavel
        String nome;
        String sobrenome;
        String naturalidade;
        char opcao;
        int idade;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = input.nextLine();

        System.out.print("Digite sua idade (anos): ");
        idade = input.nextInt();

        input.nextLine();

        System.out.print("Digite sua naturalidade: ");
        naturalidade = input.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N) ");
        opcao = input.nextLine().charAt(0);
        input.close();
        
        //Condições
      
        if (opcao == 'S') {
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente Novamente");
        }

    }  
}