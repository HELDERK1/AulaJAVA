/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14atividade02;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula14Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conversor conversor = new Conversor();
        System.out.printf("Insira o valor da cotacao atual do dolar: ");
        conversor.cotacao = entrada.nextDouble();
        System.out.printf("Insira o valor que deseja comprar: ");
        conversor.dolares = entrada.nextDouble();
        conversor.Converter();
    }
    
}
