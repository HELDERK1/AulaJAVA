package aula04atividade2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int anoAtual, anoNascimento;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o Ano atual:");
        anoAtual = entrada.nextInt();
        System.out.println("Informe o ano de nacimento:");
        anoNascimento = entrada.nextInt();
                
        System.out.println();
        System.out.printf("A idade e: %d%n",anoAtual - anoNascimento);
    }
    
}

