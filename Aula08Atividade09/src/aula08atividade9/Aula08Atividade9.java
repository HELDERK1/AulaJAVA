package aula08atividade9;

import java.util.Scanner;

public class Aula08Atividade9 {
 public static void main(String[] args) {
        int a, b;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        a = entrada.nextInt();
        System.out.println("Informe o valor de B:");
        b = entrada.nextInt();
        
        if (0 == b%a || a%b == 0) {
            System.out.printf("O numero %d e multiplo de %d\n", a, b);
        } else {
            System.out.printf("O numero %d nao e multiplo de %d\n", a, b);
        }
    }
}
