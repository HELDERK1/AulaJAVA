/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Aula13Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candidato c1 = new Candidato();
        c1.pessoaCandidata = "Maria Joaquina";
        c1.vaga = "GERAL";
        c1.pretensaoSalarial = 3000;
        c1.status();
        c1.enviarTesteTecnico();
        System.out.println(" ");

        Candidato c2 = new Candidato();
        c2.pessoaCandidata = "Maria Madalena";
        c2.vaga = "TECNOLOGIA";
        c2.pretensaoSalarial = 3000;
        c2.status();
        c2.enviarTesteTecnico();
        System.out.println(" ");
    }

}
