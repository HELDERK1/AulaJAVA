/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade04 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int num = 1, soma = 0, somaL3 = 0, somaC2 = 0, somaD = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Vamos popular a matriz: \n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Insira um valor de posicao [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = entrada.nextInt();
            }
        }
        LimparSaida();

        System.out.printf("    1   2   3 ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("\n%d|  ", num);
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d   ", matriz[i][j]);
                soma += matriz[i][j];
                if (i == 2)
                    somaL3 += matriz[i][j];
                if (j == 1)
                    somaC2 += matriz[i][j];
                if (j == i)
                    somaD += matriz[i][j];
            }
            num++;
        }

        System.out.printf("\n\n");
        System.out.printf("A) - Soma total dos elementos: %d\n", soma);
        System.out.printf("B) - Soma dos elementos da linha 3: %d\n", somaL3);
        System.out.printf("C) - Soma dos elementos da coluna 2: %d\n", somaC2);
        System.out.printf("D) - Soma dos elementos da diagonal: %d\n", somaD);
    }

    public final static void LimparSaida() {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
    }
}
