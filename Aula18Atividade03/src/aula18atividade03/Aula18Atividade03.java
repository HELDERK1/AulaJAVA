/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula18atividade03;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula18Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ILinguagem objCand1 = new LinguagemPrograma();
        ILinguagem objCand2 = new LinguagemPrograma();
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o nome do primeiro candidato: ");
        objCand1.Pessoa(entrada.next());

        System.out.printf("Digite linguagem do primeiro candidato: ");
        objCand1.LinguagemProgramacao(entrada.next());

        System.out.printf("Digite a experiencia do primeiro candidato: ");
        objCand1.Experiecia(entrada.next());

        System.out.printf("\n");
        
        System.out.printf("Digite o nome do segundo candidato: ");
        objCand2.Pessoa(entrada.next());

        System.out.printf("Digite linguagem do segundo candidato: ");
        objCand2.LinguagemProgramacao(entrada.next());

        System.out.printf("Digite a experiencia do segundo candidato: ");
        objCand2.Experiecia(entrada.next());
        
        objCand1.ImprimirCandidato();
        
        System.out.printf("\n");
        
        objCand2.ImprimirCandidato();
    }

}
