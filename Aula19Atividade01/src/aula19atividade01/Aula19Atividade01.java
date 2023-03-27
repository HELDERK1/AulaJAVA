/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula19atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Aula19Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Jose");
        func.setCpf("08496636798");
        func.setSalario(10000);
        func.Apresentar();
        System.out.println("");
        Gerente ger = new Gerente();
        ger.setNome("Maria");
        ger.setCpf("07796636760");
        ger.setSalario(20000);
        ger.setSenha(10);
        ger.Autenticar(10);
        func.Apresentar();
    }

}
