/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09atividade1;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula09Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont1, cont2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor para contador:");
        cont1 = entrada.nextInt();

        System.out.println("Informe outro valor para contador:");
        cont2 = entrada.nextInt();

        if (cont1 <= cont2) {
            while (cont1 <= cont2) {
                System.out.printf("%d\n", cont1);
                cont1++;
            }
        } else {
            while (cont1 >= cont2) {
                System.out.printf("%d\n", cont1);
                cont1--;
            }
        }

    }

}
