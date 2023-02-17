package aula03atividade4;

import java.util.Scanner;

public class Aula03Atividade4 {
    public static void main(String[] args) {
        double num1, num2;
        String nome;
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        nome = entrada.nextLine();
        System.out.println("Informe a idade do aluno:");
        idade = entrada.nextInt();
        
        
        System.out.println("Informe a primeira nota do aluno:");
        num1 = entrada.nextInt();
        num2 = num1;
        System.out.println("Informe a segunda nota do aluno:");
        num1 = entrada.nextInt();
        num2 = num2 + num1;
        System.out.println("Informe a terceira nota do aluno:");
        num1 = entrada.nextInt();
        num2 = num2 + num1;
        System.out.println("Informe a quarta nota do aluno:");
        num1 = entrada.nextInt();
        num2 = num2 + num1;
        
        System.out.println();
        System.out.printf("O aluno %s, de idade %d, obteve a media de: %.2f%n",nome, idade, num2/4);
    }
    
}

