/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade09;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10atividade09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  horas, minutos;
        double i = 0.00, massaInicial, massaFinal, temp;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a massa inicial do material: ");
        massaInicial = entrada.nextDouble();
        massaFinal = massaInicial;
        while (massaFinal > 0.5) {
            massaFinal = massaFinal / 2;
            i += 50;
        }
        temp = i / 60;
        horas = (int)Math.abs(temp);
        
        minutos = (int)((temp - horas) * 60);
        System.out.printf("O tempo para a massa ir de %.2f ate %.2f foram %d horas e %d minutos.\n", massaInicial, massaFinal, horas, minutos);
    }

}
