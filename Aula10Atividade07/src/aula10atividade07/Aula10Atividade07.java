/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade07;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade07 {

    public static void main(String[] args) {
        double salario = 2000.00, aumento = 1.50;
        int ano = 2010;

        do {
            System.out.printf("%d - salario = %.0f\n", ano, salario);

            salario = salario + salario * aumento / 100;
            aumento = aumento * 2;

            ano++;
        } while (ano <= 2022);

    }

}
