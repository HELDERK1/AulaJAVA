/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula17atividade02;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula17Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        IPessoas objPessoas = new Pessoas();
        
        String inscricao, nome, sobrenome;
        Endereco endereco = new Endereco();

        System.out.printf("Digite o numero da inscricao: ");
        inscricao = entrada.next();

        System.out.printf("Digite o Nome: ");
        nome = entrada.next();

        System.out.printf("Digite o sobrenome: ");
        sobrenome = entrada.next();

        System.out.printf("Digite a rua: ");
        endereco.rua = entrada.next();

        System.out.printf("Digite o numero: ");
        endereco.numero = entrada.next();

        System.out.printf("Digite o bairro: ");
        endereco.bairro = entrada.next();

        System.out.printf("Digite a cidade: ");
        endereco.cidade = entrada.next();

        System.out.printf("Digite o estado: ");
        endereco.estado = entrada.next();
        
        objPessoas.Cadastrar(inscricao, nome, sobrenome, endereco);
        objPessoas.Apresentar();
    }

}
