/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade08;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade08 {

    public static void main(String[] args) {
        Random gerador = new Random();

        List<Integer> vetor = new ArrayList<>();

        System.out.printf("Numeros da sorte sao: ");

        for (int i = 0; i < 6; i++) {
            vetor.add(gerador.nextInt(1, 61));
        }
        
        Collections.sort(vetor);
        
        for (int i = 0; i < 6; i++) {
            String sinal = " ,";
            if (i == 5) {
                sinal = ".";
            }
            System.out.printf("%d%s", vetor.get(i), sinal);
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
