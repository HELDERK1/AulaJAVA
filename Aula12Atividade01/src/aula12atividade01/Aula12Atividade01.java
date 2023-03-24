/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula12Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas1[] = new double[5];
        double notas2[] = new double[5];
        double media[] = new double[5];
        String alunos[] = new String[5];
        double mediaGeral = 0.00;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o nome do %d aluno: \n", i + 1);
            alunos[i] = entrada.next();

            System.out.printf("Insira a primeira nota do %d aluno: \n", i + 1);
            notas1[i] = entrada.nextDouble();

            System.out.printf("Insira a segunda nota do %d aluno: \n", i + 1);
            notas2[i] = entrada.nextDouble();

            media[i] = (notas1[i] + notas2[i]) / 2;
            mediaGeral += media[i];
        }
        mediaGeral = mediaGeral / 5;
        System.out.printf("Media geral da turma = %.2f \n", mediaGeral);
        
        System.out.printf("Os alunos que passaram acima da media da turma sao:\n");
        for (int i = 0; i < 5; i++) {
            if (media[i] > mediaGeral) {
                System.out.printf("%s obteve a media de %.2f \n", alunos[i], media[i]);
            }
        }
    }

}
