package aula14atividade07;

public class Estudante {
    String nomeAluno;
    double nota1, nota2, nota3;
    void VerificarAprovacao(){
        var nota = (nota1 + nota2 + nota3);
        if (nota >= 60) {
            System.out.printf("O aluno %s esta Aprovado!\n", this.nomeAluno);            
        }else{
            System.out.printf("O aluno %s esta Reprovado!\n", this.nomeAluno); 
            System.out.printf("O aluno %s precisa de %.2f para ser aprovado.\n", this.nomeAluno, 60 - nota); 
        }
    }
    boolean VerificaNota1(){
        return (this.nota1 <= 30 && this.nota1 >= 0);
    }
    boolean VerificaNota2(){
        return (this.nota2 <= 35 && this.nota2 >= 0);
    }
    boolean VerificaNota3(){
        return (this.nota3 <= 35 && this.nota3 >= 0);
    }
}
