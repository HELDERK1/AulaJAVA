/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Quadrado implements ICalculosGeometricos {

    private double lado;    

    public Quadrado(double lado, String figura) {
        this.lado = lado;
        this.figura = figura;
    }
    private String figura;

    @Override
    public String GetNomeFigura() {        
        return this.figura;
    }

    @Override
    public double GetArea() {
       return this.lado * this.lado; 
    }

    @Override
    public double GetPerimetro() {
        return this.lado * 4; 
    }


}
