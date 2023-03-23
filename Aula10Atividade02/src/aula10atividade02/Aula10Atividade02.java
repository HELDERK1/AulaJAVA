/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10atividade02;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int senha = 2023, iSenha;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.printf("Digite a senha: ");
            iSenha = entrada.nextInt();
            if (iSenha != senha) {
               System.out.printf("Senha invalida.\nTente novamente.\n"); 
            }else{
               System.out.printf("Acesso permitido!\n");  
            }
        } while (iSenha != senha);

    }

}
