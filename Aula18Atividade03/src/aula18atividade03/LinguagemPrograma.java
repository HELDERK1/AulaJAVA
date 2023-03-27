/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18atividade03;

/**
 *
 * @author Helder Kennedy
 */
public class LinguagemPrograma implements ILinguagem {

    public String nome, linguagem, experiencia;

    @Override
    public void Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void LinguagemProgramacao(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public void Experiecia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void ImprimirCandidato() {
        System.out.printf("Candidato: %s\nLinguagem: %s\nExperiencia: %s\n", this.nome, this.linguagem, this.experiencia);
    }
}
