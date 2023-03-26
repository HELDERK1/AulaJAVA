/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14atividade04;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula14Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Material material = new Material();
        
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a massa inicial do material em gramas: ");
        material.massaInicial = entrada.nextDouble();
        material.CalcularTempo();
    }

}
