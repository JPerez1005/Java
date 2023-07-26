package TratamientoExcepciones;

import javax.swing.JOptionPane;

public class TryCatch {

    public static void main(String[] args) {
        int n=1;
        do {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog
                    ("Por favor digite un numero"));

                System.out.println(n);
            } catch (NumberFormatException e) {
                System.out.println("lo que acaba de digitar no es un numero"+
                        "\nLo que digito fue: "+e);
            }
        } while (n>0);
        
        
        
    }
    
}
