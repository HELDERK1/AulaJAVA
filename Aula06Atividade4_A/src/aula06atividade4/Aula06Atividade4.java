package aula06atividade4;

import java.util.Scanner;

public class Aula06Atividade4 {

    public static void main(String[] args) {
        double cont = 3.33, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextDouble();
        valor %= cont;
        System.out.printf("O novo valor = %.2f%n", valor);
    }
}
