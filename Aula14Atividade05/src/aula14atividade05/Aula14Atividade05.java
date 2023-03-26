/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14atividade05;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula14Atividade05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo objRetangulo = new Retangulo();
        
        System.out.printf("Digite a altura do retangulo: ");
        objRetangulo.altura = entrada.nextDouble();
        System.out.printf("Digite a largura do retangulo: ");
        objRetangulo.largura = entrada.nextDouble();
        
        objRetangulo.CalcularArea();
        objRetangulo.CalcularPerimetro();
        objRetangulo.CalcularDiagonal();
    }

}
