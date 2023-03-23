/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08atividade5;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula08Atividade5 {

    public static void main(String[] args) {
        double salario;
        int aumento;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe salario:");
        salario = entrada.nextDouble();

        if (salario >= 16) {
            aumento = 0;
        } else if (salario >= 12) {
            aumento = 7;
        } else if (salario >= 10) {
            aumento = 10;
        } else if (salario >= 7) {
            aumento = 12;
        } else if (salario >= 4) {
            aumento = 15;
        } else {
            aumento = 20;
        }
        System.out.printf("Voce tera %d aumento, seu salario atual e %.2f, seu novo salario sera %.2f\nAluno aprovado\n",aumento, salario, salario + salario*aumento/100);
    }

}
