/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade04;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade04 {

    public static void main(String[] args) {
        int x, y;
        Boolean ver = true;
        Scanner entrada = new Scanner(System.in);

        do {
            try {
                System.out.printf("Digite a coordenada X: ");
                x = entrada.nextInt();
                System.out.printf("Digite a coordenada Y: ");
                y = entrada.nextInt();

                if (x == 0 && y == 0) {
                    System.out.printf("Posicao na origem.\n");
                } else if (x == 0) {
                    System.out.printf("Posicao eixo X.\n");
                } else if (y == 0) {
                    System.out.printf("Posicao eixo Y.\n");
                } else if (x > 0 && y > 0) {
                    System.out.printf("Posicao quadrante 1.\n");
                } else if (x > 0 && y < 0) {
                    System.out.printf("Posicao quadrante 2.\n");
                } else if (x < 0 && y < 0) {
                    System.out.printf("Posicao quadrante 3.\n");
                } else {
                    System.out.printf("Posicao quadrante 4.\n");
                }
            } catch (Exception e) {
                ver = false;
            }

        } while (ver);

        System.out.printf("Algoritimo interrompido\n");
    }

}
