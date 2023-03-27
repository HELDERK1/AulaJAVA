/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Retangulo extends Forma {
    private double largura, altura;

    @Override
    public double CalcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "largura = " + largura + ", altura = " + altura + ", Cor = " + super.getCor() + '}';
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
