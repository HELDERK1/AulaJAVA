/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula18atividade01;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula18Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numeroDaConta, proprietario;
        IConta objConta = new Conta();
        
        System.out.printf("Digite o numero da conta: ");
        numeroDaConta = entrada.next();
        
        System.out.printf("Digite o nome do titular: ");
        proprietario = entrada.next();
        
        objConta.Cadastrar(numeroDaConta, proprietario);
                
        System.out.printf("Digite o valor para deposito: ");
        objConta.Depositar(entrada.nextDouble());
        
        objConta.ImprimirDados();
        
        System.out.printf("Digite o valor para saque: ");
        objConta.Sacar(entrada.nextDouble());
        
        objConta.ImprimirDados();
    }

}
