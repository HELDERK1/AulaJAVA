/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08atividade8;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula08Atividade8 {

    public static void main(String[] args) {
        double peso, altura, calculo;
        String resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso");
        peso = entrada.nextDouble();
        System.out.println("Digite a altura");
        altura = entrada.nextDouble();

        calculo = peso / (Math.pow(altura, 2));

        if (calculo < 16) {
            resultado = "Magreza grave";
        } else if (17 < calculo) {
            resultado = "Magreza moderada";
        } else if (18.5 < calculo) {
            resultado = "Magreza leve"; 
        } else if (25 < calculo) {
            resultado = "Saudavel"; 
        } else if (30 < calculo) {
            resultado = "Sobrepeso"; 
        } else if (35 < calculo) {
            resultado = "Obesidade grau I"; 
        } else if (40 < calculo) {
            resultado = "Obesidade grau II (severa)"; 
        } else {
            resultado = "Obesidade grau III (morbida)"; 
        }

        System.out.printf("Resultado do IMC: %s\n", resultado);
    }
}
