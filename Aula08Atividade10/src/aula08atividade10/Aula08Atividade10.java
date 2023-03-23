package aula08atividade10;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Aula08Atividade10 {

    public static void main(String[] args) throws ParseException {
        LocalTime a, b;
        Scanner entrada = new Scanner(System.in);
        Duration dur;

        System.out.println("Informe a data de entrada no jogo (24h):");
        a = LocalTime.parse(entrada.next());
        System.out.println("Informe a data de saida do jogo (24h):");
        b = LocalTime.parse(entrada.next());

        if (a.isAfter(b)) {
            dur = ((Duration.between(a, LocalTime.parse("23:00")).plusHours(b.getHour())).plusMinutes(b.getMinute())).plusHours(1);
        } else {
            dur = Duration.between(a, b);
        }

        LocalTime permanencia = LocalTime.ofNanoOfDay(dur.toNanos());

        System.out.println("A permanencia no jogo foi de " + permanencia.toString() + "hs\n");
    }

}
//System.out.println("Digite a Data");
//Date date = sdf.parse(sc.next());
//funcionario.setDataNascimento(date);
//Duration dur = new Duration(dtOther, dtToday)
//Duration diferenca = Duration.between(horaInicio, horaFim);
//LocalTime localTimeDiferenca = LocalTime.ofNanoOfDay(diferenca.toNanos());
//System.out.println(localTimeDiferenca); // 02:00
