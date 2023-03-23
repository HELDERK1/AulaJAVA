package aula08atividade12;

import java.util.Scanner;

public class Aula08Atividade12 {

    public static void main(String[] args) {
        int i, a, b, c, maior, menor, meio;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite um valor inteiro positivo para I de 1 a 3:");
            i = entrada.nextInt();
        } while (i < 0);

        System.out.println("Digite um valor inteiro para A:");
        a = entrada.nextInt();

        System.out.println("Digite um valor inteiro para B:");
        b = entrada.nextInt();

        System.out.println("Digite um valor inteiro para C:");
        c = entrada.nextInt();

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        }else if (b > a && b > c) {
            maior = b;
             if (a > c) {
                meio = a;
                menor = c;
            } else {
                meio = c;
                menor = a;
            }
        }else{
            maior = c;
             if (b > a) {
                meio = b;
                menor = a;
            } else {
                meio = a;
                menor = b;
            }
        }
        switch (i) {
            case 1 -> System.out.printf("Pelo valor de I, sua ordem e crescente: %d, %d e %d.\n", menor, meio, maior);
            case 2 -> System.out.printf("Pelo valor de I, sua ordem e decrescente: %d, %d e %d.\n", maior, meio, menor);
            case 3 -> System.out.printf("Pelo valor de I, sua ordem e maior no meio: %d, %d e %d.\n", meio, maior, menor);
            default -> System.out.printf("Pelo valor de I, nao possui uma ordem a ser escrita.\n");
        }
    }

}
