/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14atividade05;

/**
 *
 * @author Helder Kennedy
 */
public class Retangulo {

    double altura, largura;

    void CalcularArea() {
        System.out.printf("A area do retangulo = %.2f\n", this.altura * this.largura);
    }

    void CalcularPerimetro() {
        System.out.printf("O perimetro do retangulo = %.2f\n", this.altura * 2 + this.largura * 2);
    }
    void CalcularDiagonal() {
        System.out.printf("A diagonal do retangulo = %.2f\n", Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2)));
    }
}
