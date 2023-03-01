package aula06atividade4.b;

import java.util.Scanner;

public class Aula06Atividade4B {

    public static void main(String[] args) {
        int cont = 3, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextInt();
        valor %= cont;
        System.out.printf("O novo valor = %d\n", valor);
    }
}

