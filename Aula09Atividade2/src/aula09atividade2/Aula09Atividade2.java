/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09atividade2;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula09Atividade2 {

    public static void main(String[] args) {
        int numeroAlunos;
        double nota, media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero de alunos:");
        numeroAlunos = entrada.nextInt();

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("Informe a primeira nota");
            nota = entrada.nextDouble();
            System.out.println("Informe a segunda nota");
            nota += entrada.nextDouble();
            System.out.println("Informe a terceira nota");
            nota += entrada.nextDouble();
            media = nota / 3;

            System.out.printf("A media do aluno %d e: %.2f\n", i + 1, media);
        }
    }
}
