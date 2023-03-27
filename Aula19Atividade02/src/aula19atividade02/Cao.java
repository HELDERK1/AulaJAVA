/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula19atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Cao extends Animal  {

    @Override
    public void Falar() {
        System.out.println("Au au");
    }

    @Override
    public void Comer() {
        if (isFome()) {
        System.out.println("Racao para cao");
        } else {
            System.out.println("Nao esta com fome!");
        }
    }
}
