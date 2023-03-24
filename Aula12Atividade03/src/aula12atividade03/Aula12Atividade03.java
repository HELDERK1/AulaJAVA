/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade03;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira um valor inteiro: \n");
        num = entrada.nextInt();
        if (VerificaPar(num)) {
            System.out.printf("O numero %s e par.\n", num);
        }else{
            System.out.printf("O numero %s e impar.\n", num);
        }
    }

    public static boolean VerificaPar(int num) {
        return num % 2 == 0;
    }
}
