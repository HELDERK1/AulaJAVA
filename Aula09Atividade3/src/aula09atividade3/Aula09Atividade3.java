package aula09atividade3;

import java.util.Scanner;

public class Aula09Atividade3 {

     public static void main(String[] args) {
        int valor, demonst, calc;
        String valida;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Informe o valor para calcular o fatorial:");
            valor = entrada.nextInt();
            demonst = valor;
            calc = 1;
            if (valor == 0) {

            } else if (valor < 0) {
                calc = 0;
            } else {

                while (valor > 1) {
                    calc = calc * valor;
                    valor--;
                }
            }
            System.out.printf("Resultado do fatorial de %d = %d\n", demonst, calc);
            System.out.println("Deseja calcular outro fatorial?\nDigite S para sim.");
            valida = entrada.next();
        } while (valida.toUpperCase().equals("S"));

    }
}
