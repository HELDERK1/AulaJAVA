/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula18atividade04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula18Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!\n");
        } catch (InputMismatchException e) {
            System.out.println("Input error!!\n");
        }
        System.out.println("Fim do programa!\n");
        sc.close();
    }

}
