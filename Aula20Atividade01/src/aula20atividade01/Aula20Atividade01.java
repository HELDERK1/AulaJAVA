/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula20Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta();
        ContaJuridica conta2 = new ContaJuridica();

        System.out.printf("Informe o numero da conta: ");
        conta1.setNumeroConta(sc.nextInt());

        System.out.printf("Informe o nome do titular: ");
        conta1.setProprietario(sc.next());

        System.out.printf("Informe o valor para deposito: ");
        conta1.Depositar(sc.nextDouble());

        conta1.toString();

        System.out.printf("Informe o valor para saque: ");
        conta1.Sacar(sc.nextDouble());

        conta1.toString();

        System.out.println("##################################");

        System.out.printf("Informe o numero da conta: ");
        conta2.setNumeroConta(sc.nextInt());

        System.out.printf("Informe o nome do titular: ");
        conta2.setProprietario(sc.next());

        System.out.printf("Informe o valor para deposito: ");
        conta2.Depositar(sc.nextDouble());

        conta2.toString();

        System.out.printf("Informe o valor para saque: ");
        conta2.Sacar(sc.nextDouble());

        conta2.toString();
        
        do {            
            System.out.printf("Informe o valor para emprestimo: ");
        } while (!conta2.SolicitarEmprestimo(sc.nextDouble()));

        conta2.toString();

        System.out.println("##################################");

    }

}
