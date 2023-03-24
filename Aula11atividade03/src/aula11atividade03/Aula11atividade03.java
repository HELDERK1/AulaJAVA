/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11atividade03;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula11atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um numero: \n");
        num1 = entrada.nextDouble();
        System.out.printf("Digite um numero: \n");
        num2 = entrada.nextDouble();
        
        Imprimir("soma", Soma(num1, num2));
        Imprimir("multiplicacao", Multiplicacao(num1, num2));
        Imprimir("dobra", Dobrar(num1));
        Imprimir("dobra", Dobrar(num2));
    }

    public static double Soma(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double Multiplicacao(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double Dobrar(double num) {
        double result = num * 2;
        return result;
    }

    public static void Imprimir(String acao, double result) {
        System.out.printf("O resultado da %s foi = %.2f \n", acao, result);
    }
}
