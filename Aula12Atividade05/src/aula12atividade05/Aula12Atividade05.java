/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade05;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade05 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][4];
        int num = 1;
        boolean negativo = false;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Vamos popular a matriz: \n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Insira um valor de posicao [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = entrada.nextInt();
            }
        }
        LimparSaida();
        System.out.printf("Imprimir a matriz original: \n");
        System.out.printf("    1   2   3   4 ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("\n%d|  ", num);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d   ", matriz[i][j]);
                if (matriz[i][j] < 0) {
                    negativo = true;
                }
            }
            num++;
        }
        System.out.printf("\n\n");
        if (negativo) {
            num = 1;
            System.out.printf("Imprimir a matriz substituindo os numeros negativos por 0:\n");
            System.out.printf("    1   2   3   4 ");
            for (int i = 0; i < 3; i++) {
                System.out.printf("\n%d|  ", num);
                for (int j = 0; j < 4; j++) {
                    if (matriz[i][j] < 0) {
                        matriz[i][j] = 0;
                    }
                    System.out.printf("%d   ", matriz[i][j]);
                }
                num++;
            }
        } else {
            System.out.printf("A matriz nao possio numeros negativos.");
        }
        System.out.printf("\n");
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
