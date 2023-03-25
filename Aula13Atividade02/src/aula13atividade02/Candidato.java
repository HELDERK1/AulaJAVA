/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Candidato {

    String vaga, pessoaCandidata;
    double pretensaoSalarial;

    void status() {
        System.out.println("Nome do Candidato: " + this.pessoaCandidata);
        System.out.println("Vaga: " + this.vaga);
        System.out.println("Pretensao Salarial: " + this.pretensaoSalarial);
    }

    void enviarTesteTecnico() {
        if ("TECNOLOGIA".equals(this.vaga)) {
            System.out.println("Enviar TESTE de TECNOLOGIA para " + this.pessoaCandidata);
        } else {
            System.out.println("Enviar TESTE de GERAL para " + this.pessoaCandidata);
        }
    }
}
