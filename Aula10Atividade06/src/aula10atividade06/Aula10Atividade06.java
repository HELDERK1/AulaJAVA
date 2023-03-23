/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade06;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade06 {

    public static void main(String[] args) {
        int num, cont = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o numero para ser escrito: ");
        num = entrada.nextInt();

        do {

            System.out.printf("%d - %d ao quadrado = %.0f,  %d ao cubo = %.0f\n",cont, cont, Math.pow(cont, 2), cont, Math.pow(cont, 3) );
            cont++;
        } while (cont <= num);

    }

}
