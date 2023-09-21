package aprendendojava;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;

class TesteUserLocale {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println ("A linguagem da sua máquina é: " +loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (  loc.getLanguage()); // imprime "pt"
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    }
}
