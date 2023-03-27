/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula19atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Gato  extends Animal {

    @Override
    public void Falar() {
        System.out.println("Miau");
    }

    @Override
    public void Comer() {
        if (isFome()) {
        System.out.println("Racao para gato");
        } else {
            System.out.println("Nao esta com fome!");
        }
    }
}
