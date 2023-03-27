/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula19atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Aula19Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homem homem = new Homem();
        Cao cao = new Cao();
        Gato gato = new Gato();
        Papagaio papagaio = new Papagaio();
        
        homem.setNome("Joao");
        homem.setIdade(25);
        homem.setFome(true);
        homem.Falar();
        homem.Comer();
        System.out.println(homem.toString());
        System.out.println("");
        
        cao.setNome("Pingo");
        cao.setIdade(2);
        cao.setFome(false);
        cao.Falar();
        cao.Comer();
        System.out.println(cao.toString());
        System.out.println("");
        
        gato.setNome("Tigrinho");
        gato.setIdade(5);
        gato.setFome(true);
        gato.Falar();
        gato.Comer();
        System.out.println(gato.toString());
        System.out.println("");
        
        papagaio.setNome("Falador");
        papagaio.setIdade(12);
        papagaio.setFome(false);
        papagaio.Falar();
        papagaio.Comer();
        System.out.println(papagaio.toString());
        System.out.println("");
    }
    
}
