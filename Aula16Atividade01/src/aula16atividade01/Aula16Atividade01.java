/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula16Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBanco objContaBanco = new ContaBanco();

        String dono, tipo;

        System.out.printf("Abrir a conta: \n");
        System.out.printf("Digite o nome do titular: ");
        dono = entrada.next();

        do {
            System.out.printf("Digite o tipo de conta (CC ou CP): ");
            tipo = entrada.next();
        } while (!(tipo.toUpperCase().equals("CC") || tipo.toUpperCase().equals("CP")));

        objContaBanco.AbrirConta(dono, tipo);
        objContaBanco.ImprimirDados();

        System.out.printf("Digite o valor de deposito: ");
        objContaBanco.Depositar(entrada.nextDouble());
        objContaBanco.ImprimirDados();

        objContaBanco.PagarMensal();
        objContaBanco.ImprimirDados();

        System.out.printf("Digite o valor de saque: ");
        objContaBanco.Sacar(entrada.nextDouble());
        objContaBanco.ImprimirDados();

        objContaBanco.FecharConta();

        while (objContaBanco.getStatus()) {
            System.out.printf("Digite o valor de saque: ");
            objContaBanco.Sacar(entrada.nextDouble());
            objContaBanco.ImprimirDados();
            objContaBanco.FecharConta();
        }
    }

}
