/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Triangulo {
    double a, b, c;
    
    double CalcularArea(){
        double area;
        double semiPeri;
        semiPeri = (this.a + this.b + this.c/2);
        area = semiPeri*(semiPeri-a)*(semiPeri-b)*(semiPeri-c);
        area = Math.sqrt(area);
        return area;
    }            
}
