/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade05;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade05 {

    public static void main(String[] args) {
        int prod, a = 0, b = 0, c = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            do {
                System.out.printf("Escolha um produto para votacao:\n");
                System.out.printf("1 - Produto A\n2 - Produto B\n3 - Produto C\n4 - Fim\n");
                prod = entrada.nextInt();

            } while (prod != 1 && prod != 2 && prod != 3 && prod != 4);

            switch (prod) {
                case 1 ->
                    a++;
                case 2 ->
                    b++;
                case 3 ->
                    c++;
            }

        } while (prod != 4);

        System.out.printf("Obrigado pela votacao\n");
        System.out.printf("O produto A recebeu %d votos\n", a);
        System.out.printf("O produto B recebeu %d votos\n", b);
        System.out.printf("O produto C recebeu %d votos\n", c);
    }

}
