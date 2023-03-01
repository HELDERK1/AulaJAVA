package aula06atividade3.a;

import java.util.Scanner;

public class Aula06Atividade3A {

    public static void main(String[] args) {
        double cont = 3.0, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextDouble();
        valor /= cont;
        System.out.printf("O novo valor = %.1f%n", valor);
    }

}
