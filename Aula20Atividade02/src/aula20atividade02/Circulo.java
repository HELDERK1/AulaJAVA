/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Circulo extends Forma {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return Math.pow((Math.PI*this.raio), 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio = " + raio + ", Cor = " + super.getCor() + '}';
    }
}
