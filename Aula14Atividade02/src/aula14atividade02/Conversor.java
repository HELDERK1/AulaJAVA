/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Conversor {
    double cotacao, dolares;
    void Converter(){
        double reais;
        reais = this.cotacao * this.dolares;
        reais += reais*6/100;
        System.out.printf("O valor a ser pago = R$ %.2f\n", reais);
    }
}
