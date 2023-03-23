package aula08atividade2;

import java.util.Scanner;

public class Aula08Atividade2 {

    public static void main(String[] args) {
        int valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextInt();
        
        if (valor < 0) {
            System.out.printf("Numero negativo\n");
        }
        else if (valor % 2 == 0) {
            System.out.printf("Numero par\n");
        } else {
            System.out.printf("Numero impar\n");
        }
    }

}
