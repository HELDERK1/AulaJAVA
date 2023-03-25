/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade07;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int numAleatorio, num, tentativas = 0;

        numAleatorio = gerador.nextInt(101);

        do {
            System.out.printf("Insira um valor para adivinhar o valor escolhido aleatorio: ");
            num = entrada.nextInt();
            System.out.printf("\n");
            if (num > numAleatorio) {
                System.out.printf("O numero digitado e maior que o numero aleatorio.\n");
            } else if (num < numAleatorio) {
                System.out.printf("O numero digitado e menor que o numero aleatorio.\n");
            }
            tentativas++;
        } while (num != numAleatorio);

        System.out.printf("Parabens! Acertou com apenas %d tentativas!\n", tentativas);
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
