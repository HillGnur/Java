package segundoprograma;

import java.awt.GraphicsEnvironment;
import java.util.Date;
import java.util.Locale;


public class SegundoPrograma {

    public static void main(String[] args) {
        
        Date dataAtual = new Date();
        System.out.println("O idioma do seu sistema é: " + Locale.getDefault());
        System.out.println("Sua resolução atual é: " + GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth() + "x" + GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight());
        System.out.println(dataAtual.toString());
        
    }
    
}
