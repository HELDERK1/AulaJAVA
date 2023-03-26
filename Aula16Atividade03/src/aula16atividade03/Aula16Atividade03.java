/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16atividade03;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula16Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacaoMatematica objOperacaoMatematica = new OperacaoMatematica();
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o valor para avaliar: ");
        objOperacaoMatematica.setNum(entrada.nextInt());
        
        objOperacaoMatematica.VerificaParOuImpar();
        objOperacaoMatematica.VerificaSePrimo();
    }

}
