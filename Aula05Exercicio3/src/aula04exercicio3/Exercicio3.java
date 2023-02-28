package aula04exercicio3;

import java.util.Calendar;

public class Exercicio3 {

    public static void main(String[] args) {
        String resultado;
        Calendar dataAtual = Calendar.getInstance();
        Integer diaDoMes = dataAtual.get(Calendar.DAY_OF_MONTH);
        resultado = diaDoMes <= 15 ? "Estamos na primeira quizena" : "Estamos na segunda quizena";
        System.out.printf(resultado + "\n");
    }

}
