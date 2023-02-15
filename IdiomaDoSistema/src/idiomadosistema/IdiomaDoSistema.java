package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale linguagem = Locale.getDefault();
        System.out.println (linguagem.getDisplayLanguage().toUpperCase() + " " + linguagem.getLanguage().toUpperCase() + "-" + linguagem.getCountry().toUpperCase());
    }    
}
