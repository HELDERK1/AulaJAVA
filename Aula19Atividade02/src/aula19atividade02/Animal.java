/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula19atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Animal {
    private String nome;
    private int idade;
    private boolean fome;

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome = " + nome + ", idade = " + idade + '}';
    }
    public void Falar(){
        
    }
    public void Comer(){
        
    }
}
