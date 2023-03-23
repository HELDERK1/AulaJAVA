/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont = 1, verif = 0;
        String msg;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        num = entrada.nextInt();

        do {
            if (num % cont == 0) {
                verif++;
            }

            cont++;
        } while (cont <= num);
        msg = verif == 2 ? "O numero e primo\n" : "O numero nao e primo\n2";

        System.out.printf(msg);

    }

}
