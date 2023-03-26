/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16atividade02;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula16Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro objCarro = new Carro();        
        
        System.out.printf("Digite a marca do carro: ");
        objCarro.setMarca(entrada.next());
        
        System.out.printf("Digite a cor do carro: ");
        objCarro.setCor(entrada.next());
        
        System.out.printf("Digite o ano do carro: ");
        objCarro.setAno(entrada.nextInt());
        
        System.out.printf("Digite a velocidade do carro: ");
        objCarro.setVelocidadeAtual(entrada.nextInt());
        
        objCarro.ImprimirStatus();
        
        objCarro.Ligar();
        objCarro.ImprimirStatus();
        
        objCarro.PegarMarcha();
        objCarro.ImprimirStatus();
        
        objCarro.Acelerar();
        objCarro.ImprimirStatus();
        
        objCarro.Desligar();
        objCarro.ImprimirStatus();
        
    }
    
}
