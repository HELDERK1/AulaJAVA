/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade03;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade03 {

    public static void main(String[] args) {
        int num, cont = 1;
        String msg = "";
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        num = entrada.nextInt();

        do {
            if (num % cont == 0) {
                if (num == cont) {
                    msg += cont + ".";
                } else {
                    msg += cont + ", ";
                }
            }

            cont++;
        } while (cont <= num);
        System.out.printf("Os divisores do numero %d sao: %s\n", num, msg);
    }

}
