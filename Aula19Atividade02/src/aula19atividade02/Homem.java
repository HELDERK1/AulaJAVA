/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula19atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Homem extends Animal {

    @Override
    public void Falar() {
        System.out.println("Oi");
    }

    @Override
    public void Comer() {
        if (isFome()) {
            System.out.println("Churrasco");
        } else {
            System.out.println("Nao esta com fome!");
        }

    }
}
