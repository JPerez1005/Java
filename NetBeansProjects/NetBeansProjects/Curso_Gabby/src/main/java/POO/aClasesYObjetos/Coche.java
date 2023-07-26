package POO.aClasesYObjetos;

public class Coche {//Ya se hizo la creacion de la clase
    //Atributos

    String color;
    String marca;
    int km;

    //Metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();// creacion del objeto

        coche1.color = "blanco";//rellenando atributos del coche1 con un punto
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche 1 es: " + coche1.color);
        System.out.println("La marca del coche 1 es: " + coche1.marca);
        System.out.println("El kiloetraje del coche 1 es: " + coche1.km);
        //los mostramos en pantalla

        //recordar que se puede hacer mas de un objeto
        Coche coche2 = new Coche();// creacion del objeto

        coche2.color = "ROJO";//rellenando atributos del coche1 con un punto
        coche2.marca = "ferrari";
        coche2.km = 100;

        System.out.println("El color del coche 2 es: " + coche2.color);
        System.out.println("La marca del coche 2 es: " + coche2.marca);
        System.out.println("El kiloetraje del coche 2 es: " + coche2.km);
        //los mostramos en pantalla
    }
}
