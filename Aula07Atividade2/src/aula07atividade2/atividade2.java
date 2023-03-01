package aula07atividade2;

import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        double raio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor que tens sobrando:");
        raio = entrada.nextDouble();
        if (raio <= 0) {
            System.out.printf("Insira um valor positivo\n");
        } else {
            System.out.printf("A area do circulo = %.3f%n", Math.PI * Math.pow(raio, 2));
        }
    }

}
