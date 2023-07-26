package Ejercicios;

import javax.swing.JOptionPane;


/*En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los
$300. ¿Cual sera la cantidad que pagará una persona por su compra?

*/
public class MegaPlaza {

    public static void main(String[] args) {
        float valor_compra;
        
        valor_compra=Float.parseFloat(JOptionPane.showInputDialog("Digite el "
                + "valor de su compra"));
        
        if(valor_compra>300){
            JOptionPane.showMessageDialog(null,"ahora su compra sera de: "+
                    (valor_compra-valor_compra*0.2));
            JOptionPane.showMessageDialog(null, "su descuento es de: "+
                    valor_compra*0.2);
        }else{
            JOptionPane.showMessageDialog(null, "su compra es de: "+
                    valor_compra);
        }
    }
    
}
