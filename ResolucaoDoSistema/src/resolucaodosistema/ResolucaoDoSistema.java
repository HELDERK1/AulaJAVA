package resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit objTK = Toolkit.getDefaultToolkit();
        Dimension objDim = objTK.getScreenSize();        
        System.out.println("A resolução da sua máquina é: " + objDim.width + " x " + objDim.height);
    }
}
