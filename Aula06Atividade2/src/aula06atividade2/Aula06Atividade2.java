package aula06atividade2;

import java.util.Scanner;

public class Aula06Atividade2 {

    public static void main(String[] args) {
        double cont = 3, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextDouble();
        valor /= cont;
        System.out.printf("O novo valor = %.4f%n", valor);
    }

}
