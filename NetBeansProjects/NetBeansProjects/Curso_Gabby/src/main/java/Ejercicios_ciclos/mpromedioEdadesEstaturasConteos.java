package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
más de 1.75.*/

public class mpromedioEdadesEstaturasConteos {

    public static void main(String[] args) {
        int edadMedia = 0;
        byte edad, alumnosMayores = 0;
        float estatura, estaturaMedia = 0, alumnosAltos = 0;
        JOptionPane.showMessageDialog(null, "Señor usuario Digite la "
                + "informacion de 5 estudiantes");
        for (int i = 1; i < 6; i++) {
            edad = Byte.parseByte(JOptionPane.showInputDialog("Digite la edad"
                    + " del " + i + " estudiante:"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite la"
                    + " Estatura del " + i + " estudiante"));
            if (edad > 18) {
                alumnosMayores++;
            }
            if (estatura > 1.75) {
                alumnosAltos++;
            }
            edadMedia = edadMedia + edad;
            estaturaMedia = estaturaMedia + estatura;
        }

        edadMedia = edadMedia / 5;
        estaturaMedia = estaturaMedia / 5;

        JOptionPane.showMessageDialog(null,
                "La media de edad de los alumnos es: " + edadMedia
                + "\nLa media de altura de los alumnos es: " + estaturaMedia
                + "\nEL numero total de alumnos mayores a 18 años es: "
                + alumnosMayores
                + "\nEL numero total de alumnos mas altos que 1.75 es: "
                + alumnosAltos);
    }

}
