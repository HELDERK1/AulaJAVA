/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula11atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valores[] = new double[4];
        double inicio = 10.00;
        int cont = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.printf("Insira um valor de posicao %d no vetor.  ", cont + 1);
            if (cont == 0) {
                valores[cont] = entrada.nextDouble() + inicio;
            } else {
                valores[cont] = entrada.nextDouble() + valores[cont - 1];
            }
            cont++;
        } while (cont < 4);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Valor de posicao %d = %.2f\n", i + 1, valores[i]);
        }
    }

}
