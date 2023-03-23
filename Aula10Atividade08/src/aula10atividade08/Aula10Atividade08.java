/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade08;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade08 {
    
    public static void main(String[] args) {
        int cont = 1;
        double nota, mediaGeral = 0.00;
        String nome, msg;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.printf("Digite o nome do aluno: ");
            nome = entrada.next();
            System.out.printf("Digite o valor da primeira nota: ");
            nota = entrada.nextDouble();
            System.out.printf("Digite o valor da segunda nota: ");
            nota += entrada.nextDouble();
            
            if (nota/2 >= 6) {
                msg = "Aprovado";
            }
            else{
                msg = "Reprovado";
            }
            mediaGeral += nota;
            System.out.printf("O aluno %s foi %s. Sua media foi = %.2f\n", nome, msg, nota/2);
            cont++;
        } while (cont <= 3);
        
        mediaGeral = mediaGeral/6;
        
        System.out.printf("media da turma = %.2f\n", mediaGeral);
    }
    
}
