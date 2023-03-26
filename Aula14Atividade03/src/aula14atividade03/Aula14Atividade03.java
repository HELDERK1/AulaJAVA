/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14atividade03;

/**
 *
 * @author Helder Kennedy
 */
public class Aula14Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Salario salario = new Salario();
        salario.salario = 2000.00;
        salario.aumento = 1.50;
        salario.ano = 2010;
        salario.CalculaAumento();
    }

}
