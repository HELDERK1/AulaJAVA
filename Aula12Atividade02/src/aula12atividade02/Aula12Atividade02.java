/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade02;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String times[] = new String[10];
        int cont = 5;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < times.length; i++) {
            System.out.printf("Insira o nome do %d time: \n", i + 1);
            times[i] = entrada.next();
        }

        for (int i = 0; i < times.length / 2; i++) {
            System.out.printf("Rodada %d\n", i);
            for (int j = 0; j < times.length / 2; j++) {
                System.out.printf("%s X %s\n", times[j], times[j + cont]);
            }
            System.out.printf("\n");
            cont--;
        }
    }

}
