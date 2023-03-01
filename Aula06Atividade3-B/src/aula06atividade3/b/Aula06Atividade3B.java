package aula06atividade3.b;

import java.util.Scanner;

public class Aula06Atividade3B {

    public static void main(String[] args) {
        int cont = 3, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextInt();
        valor /= cont;
        System.out.printf("O novo valor = %d\n", valor);
    }
}
