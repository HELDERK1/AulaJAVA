package aula14atividade07;

import java.util.Scanner;

public class Aula14Atividade07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudante objEstudante = new Estudante();

        System.out.printf("Digite nome do aluno: ");
        objEstudante.nomeAluno = entrada.next();

        do {
            System.out.printf("Digite a primeira nota (0 a 30): ");
            objEstudante.nota1 = entrada.nextDouble();
        } while (!objEstudante.VerificaNota1());
        
        do {
            System.out.printf("Digite a segunda nota (0 a 35): ");
            objEstudante.nota2 = entrada.nextDouble();
        } while (!objEstudante.VerificaNota2());
        
        do {
            System.out.printf("Digite a terceira nota (0 a 35): ");
            objEstudante.nota3 = entrada.nextDouble();
        } while (!objEstudante.VerificaNota3());
        
        objEstudante.VerificarAprovacao();
    }

}
