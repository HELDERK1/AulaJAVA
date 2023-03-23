package aula08atividade3;

import java.util.Scanner;
public class Aula08Atividade3 {

       public static void main(String[] args) {
        double salario, financiamento;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salario:");
        salario = entrada.nextDouble();
        
        System.out.println("Informe o valor do emprestimo:");
        financiamento = entrada.nextDouble();
        
        if (financiamento <= salario*5) {
            System.out.printf("Financiamento concedido\n");
        } else {
            System.out.printf("Financiamento negado\n");
        }
    }
    
}
