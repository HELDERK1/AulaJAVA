/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula21atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Aula21Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Joao");
        p1.setCpf("00100200304");
        
        PessoaJuridica p2 = new PessoaJuridica();        
        p2.setNome("Venturus");
        p2.setCnpj("00400500607/0001");
        
        Pessoa[] lstPessoas = new Pessoa[2];
        lstPessoas[0] = p1;
        lstPessoas[1] = p2;
        
        for (Pessoa lstPessoa : lstPessoas) {
            System.out.println(lstPessoa.getNome());
        }
    }
    
}
