/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade06;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade06 {

    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Preencha o vetor: \n");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira um valor de posicao [%d] do vetor: ", i + 1);
            vetor.add(entrada.nextInt());
        }

        LimparSaida();
        System.out.printf("Imprimir a matriz original: \n");
        System.out.printf("    1   2   3   4   5   6   7   8   9  10 ");
        System.out.printf("\n  | ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d | ", vetor.get(i));
        }
        System.out.printf("\n");
        
        Collections.sort(vetor);
        
        System.out.printf("Imprimir a matriz ordem crescente: \n");
        System.out.printf("    1   2   3   4   5   6   7   8   9  10 ");
        System.out.printf("\n  | ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d | ", vetor.get(i));
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
