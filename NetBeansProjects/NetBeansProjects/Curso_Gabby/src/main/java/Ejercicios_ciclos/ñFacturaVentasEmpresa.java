package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Una empresa que se dedica a la venta de desinfectantes necesita un
        programa para gestionar las facturas. En cada factura figura: el código
        del artículo, la cantidad vendida en litros y el precio por litro. Se
        pide de 5 facturas introducidas: Facturación total, cantidad en litros 
        vendidos del artículo 1 y cuantas facturas se emitieron de
        más de $600.*/
public class ñFacturaVentasEmpresa {

    public static void main(String[] args) {
        int codArticulo, CantidadLitros, cantLitro1 = 0;
        float PrecioLitro, CantidadesMayores = 0, FacturacionTotal = 0, 
                PrecioFactura;
        for (int i = 1; i < 6; i++) {
            codArticulo = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el codigo del articulo numero " + i));
            CantidadLitros = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite los litros del articulo numero " + i));
            PrecioLitro = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el precio de litros del articulo numero " + i));
            PrecioFactura = PrecioLitro * CantidadLitros;
            FacturacionTotal += PrecioFactura;

            System.out.println("Codigo del articulo: " + codArticulo
                    + "\nLitros del Articulo: " + CantidadLitros
                    + "\nPrecio del Litro: " + PrecioLitro
                    + "\nTotal: " + PrecioFactura);
            System.out.println("---------------------------------------");
            if (i == 1) {
                cantLitro1 += CantidadLitros;
            }

            if (PrecioLitro > 600) {
                CantidadesMayores++;
            }

            
        }
System.out.println("La Facturacion total es:"
                    + FacturacionTotal + "\nCantidad de litros "
                    + "vendidas del articulo 1: "
                    + cantLitro1 + "\nSe emitieron un total de 5" 
                    + " Facturas");
    }
}
