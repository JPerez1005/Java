package Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class newVentana extends JFrame{

    JPanel panel;
    JPanel panel0;
    
    public newVentana() {
        setSize(505,500);//establecemos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);//salir del programa
        setTitle("Luffy Gear Five");//titulo de la ventana
        //setLocation(0, 0);//Establecer posicion final de la ventana
        //setBounds(200, 2000, 500, 500);//hace lo mismo que set location y 
        //setsize
        setLocationRelativeTo(null);//posicion inial en el centro
        //this.getContentPane().setBackground(Color.GRAY);//color fondo
        
    }
    
    public void inicialPanel(){
        panel0=new JPanel();//Creacion de un panel
        this.getContentPane().add(panel0);//Agregamos el panel a la ventana
        panel0.setLayout(null);//desactivamos el diseño por defecto
    }
    
    public void nuevoPanel(){
        panel=new JPanel();//Creacion de un panel
        panel.setBackground(Color.DARK_GRAY);//color del panel
        this.getContentPane().add(panel);//Agregamos el panel a la ventana
        panel.setLayout(null);//desactivamos el diseño por defecto
        JLabel etiqueta = new JLabel("One Piece",SwingConstants.CENTER);
        //creacion de jlabel para colocar etiquetas en la ventana y centrarla
        //no centrarla en la ventana si no centrarla en el JLabel mismo
        etiqueta.setBounds(10, 10,460, 50);//lugar y tamaño inicial de la 
        //etiqueta
        //etiqueta.setText("que tal?");
        etiqueta.setForeground(Color.white);//color de letra
        etiqueta.setOpaque(false);//en true aceptar cambios en la etiqueta y 
        //no dejar todo por defecto
        etiqueta.setBackground(Color.black);//color fondode la etiqueta
        etiqueta.setFont(new Font("chiller",1,50));//fuente, tamaño y negrilla
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
        ImageIcon imagen= new ImageIcon("Luffy_gear_five.jpg");
        JLabel e2=new JLabel();
        e2.setBounds(5, 90, 480,350);
        e2.setIcon( new ImageIcon(imagen.getImage().getScaledInstance
                    (e2.getWidth(), e2.getHeight(),Image.SCALE_SMOOTH)));
        //cambiar el tamaño de la imagen sin dañar la imagen misma
        
        panel.add(e2);
        
    }
    
    public void colocarBotones(){
        JButton j1=new JButton();
        j1.setBounds(20, 100, 100, 40);
        j1.setText("mugiwaras");
        j1.setEnabled(true);//nos permite establecer la presencia del boton
        j1.setMnemonic('a');//establecer atajos con alt+letra;
        j1.setBackground(Color.white);
        j1.setForeground(Color.orange);
        j1.setFont(new Font("chiller",1,20));
        panel.add(j1);
        
        JButton j2=new JButton();
        j2.setBounds(20, 200, 50, 50);
        ImageIcon power=new ImageIcon("botton.jpg");
        
        j2.setIcon(new ImageIcon(power.getImage().getScaledInstance
                (j2.getWidth(), j2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(j2);
    }
    
    public void RadioBotones() {
        panel=new JPanel();//Creacion de un panel
        this.getContentPane().add(panel);//Agregamos el panel a la ventana
        panel.setLayout(null);//desactivamos el diseño por defecto
        JRadioButton rb1=new JRadioButton("opcion 1",true);//nuevo radioboton
        rb1.setBounds(10, 100, 200, 50);//tamaño que usaremos y posicion
        rb1.setFont(new Font("cooper black",0,15));
        panel.add(rb1);
        JRadioButton rb2=new JRadioButton("opcion 2",false);
        rb2.setBounds(10, 150, 100, 50);
        rb2.setEnabled(false);
        rb2.setFont(new Font("cooper black",0,15));
        panel.add(rb2);
        JRadioButton rb3=new JRadioButton("opcion 3",false);
        rb3.setBounds(10, 200, 100, 50);
        rb3.setFont(new Font("cooper black",0,15));//tipo de fuente y tamaño
        panel.add(rb3);//Agregamos al panel
        
        ButtonGroup grb1= new ButtonGroup();
        grb1.add(rb1);
        grb1.add(rb2);
        grb1.add(rb3);
    }
    
    public void cajasDeTexto() {
        JTextField ct= new JTextField();
        ct.setBounds(50, 50, 150, 30);
        ct.setText("This is a placeholder");
        panel0.add(ct);
        System.out.println("Text in the box: "+ct.getText());
    }
    
    public void areasDeTexto(){
        JTextArea ta=new JTextArea();
        ta.setBounds(20, 20, 300, 200);
        ta.setText("yo soy el primer texto, mi nombre es setText");
        ta.append("\nyo append agrego mas texto, no necesitas a setText");
        ta.setEditable(false);//de mi depende si yo quiero que el usuario 
        //edite mi objeto
        panel0.add(ta);
        System.out.println("El texto es: "+ta.getText());
    }
    
    public void listasDesplegables(){
        String [] paises = {"Colombia","Perú","Paraguay"};
        JComboBox ld1= new JComboBox(paises);
        ld1.setBounds(20, 20, 100, 30);
        
        ld1.addItem("Canada");//se agrega al final del arreglo
        ld1.setSelectedItem("Canada");//primer objeto visto
        panel0.add(ld1); 
    }
    
    public void todosLosMetodos(){
            inicialPanel();
            //nuevoPanel();
            //colocarBotones();
            //RadioBotones();
            //cajasDeTexto();
            //areasDeTexto();
            listasDesplegables();
    }
    
    public static void main(String[] args) {
        newVentana v1=new newVentana();
        v1.todosLosMetodos();
        v1.setVisible(true);
        
    }

    

    
    
}
