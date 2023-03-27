/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Triangulo implements ICalculosGeometricos {

    private double base, altura, ladoA, ladoB, ladoC;
    private String figura;

    public Triangulo(double base, double altura, double ladoA, double ladoB, String figura) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = base;
        this.figura = figura;
    }

    @Override
    public String GetNomeFigura() {
        return this.figura;
    }

    @Override
    public double GetArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double GetPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }


}
