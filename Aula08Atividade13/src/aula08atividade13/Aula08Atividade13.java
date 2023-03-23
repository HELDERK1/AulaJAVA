/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08atividade13;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula08Atividade13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double salario, taxa, desconto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salario:");
        salario = entrada.nextDouble();
        
        if (salario <= 1903.98) {
            taxa = 0;
        } else if (salario > 1903.98 && salario <= 2826.65) {
            taxa = 7.5;
        }else if (salario > 2826.65 && salario <= 3751.05) {
            taxa = 15;
        }else if (salario > 3751.05 && salario <= 4664.68) {
            taxa = 22.5;
        }else{
            taxa = 27.5;
        }
        
        desconto = taxa == 0 ? 0 : (salario * taxa)/100;
        
        System.out.printf("Pelo salario, o valor de desconto sera %.2f\n", desconto);
    }
    
}
