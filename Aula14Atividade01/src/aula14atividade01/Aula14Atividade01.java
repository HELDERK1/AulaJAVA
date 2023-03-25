/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula14Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo tri1 = new Triangulo();
        Triangulo tri2 = new Triangulo();

        System.out.printf("Insira o valor de uma aresta do triangulo: ");
        tri1.a = entrada.nextDouble();
        System.out.printf("Insira o valor de outra aresta do triangulo: ");
        tri1.b = entrada.nextDouble();
        System.out.printf("Insira o valor da terceira aresta do triangulo: ");
        tri1.b = entrada.nextDouble();

        System.out.printf("Agora as medidas do segundo triangulo:\n");

        System.out.printf("Insira o valor de uma aresta do triangulo: ");
        tri2.a = entrada.nextDouble();
        System.out.printf("Insira o valor de outra aresta do triangulo: ");
        tri2.b = entrada.nextDouble();
        System.out.printf("Insira o valor da terceira aresta do triangulo: ");
        tri2.b = entrada.nextDouble();

        if (tri1.CalcularArea() == tri2.CalcularArea()) {
            System.out.printf("A area dos dois triangulos sao iguais.\n");
        }else  if (tri1.CalcularArea() > tri2.CalcularArea()) {
            System.out.printf("A area do primeiro triangulo e maior.\n");
        }else{            
            System.out.printf("A area do segundo triangulo e maior.\n");
        }

    }

}
