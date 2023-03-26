/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14atividade04;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Material {

    int horas, minutos;
    double i = 0.00, massaInicial, massaFinal, temp;
    Scanner entrada = new Scanner(System.in);

    void CalcularTempo() {
        massaFinal = massaInicial;
        while (massaFinal > 0.5) {
            massaFinal = massaFinal / 2;
            i += 50;
        }
        temp = i / 60;
        horas = (int) Math.abs(temp);

        minutos = (int) ((temp - horas) * 60);
        System.out.printf("O tempo para a massa ir de %.2f(g) ate %.2f(g) foram %d horas e %d minutos.\n", this.massaInicial, massaFinal, horas, minutos);
    }
}
