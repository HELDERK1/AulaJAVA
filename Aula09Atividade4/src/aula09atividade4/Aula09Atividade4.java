/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09atividade4;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula09Atividade4 {

    public static void main(String[] args) {
        int numeroPessoas, numeroHomens = 0, cont = 0;
        double altura, maiorAltura = 0;
        String sexo;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe o numero de pessoas: ");
        numeroPessoas = entrada.nextInt();

        do{
            System.out.printf("Informe a altura da pessoa: %d ", cont + 1);
            altura = entrada.nextDouble();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            do {
                System.out.printf("Informe sexo da pessoa da pessoa %d\n", cont + 1);
                System.out.printf("M - Masculino | F - Feminino: ");
                sexo = entrada.next();
            } while (!"M".equals(sexo.toUpperCase()) && !"F".equals(sexo.toUpperCase()));

            if ("M".equals(sexo.toUpperCase())) {
                numeroHomens++;
            } 
            cont++;
        }while(cont < numeroPessoas);
        
        System.out.printf("O numero de homens sao %d e a maior altura e %.2f\n", numeroHomens, maiorAltura);
        
    }

}
