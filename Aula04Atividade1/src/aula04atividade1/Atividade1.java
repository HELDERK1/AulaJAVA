package aula04atividade1;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        String nome, agencia, conta;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do Correntista:");
        nome = entrada.nextLine();
        System.out.println("Informe a agencia do Correntista:");
        agencia = entrada.nextLine();
        System.out.println("Informe conta do Correntista:");
        conta = entrada.nextLine();
                
        System.out.println();
        System.out.printf("%s%n   Agencia: %s%n     Conta: %s%n",nome, agencia, conta);
    }
    
}

