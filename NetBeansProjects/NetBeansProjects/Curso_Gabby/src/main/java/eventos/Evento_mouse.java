package eventos;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Evento_mouse extends JFrame{
    JPanel panel;
    JLabel etiqueta,e2;
    JTextArea areadeTexto;
    JButton boton;
    JTextArea ct;
    
    public Evento_mouse() {
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        metodos();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void metodos(){
        Panel();
        Etiqueta();
        AreaDeTexto();
        Boton();
    }
    
    public void Panel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    public void Etiqueta(){
        etiqueta= new JLabel("Ingrese su nombre");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("Times New Roman",1,20));
        panel.add(etiqueta);
    }
    
    public void AreaDeTexto(){
        areadeTexto = new JTextArea();
        areadeTexto.setBounds(30, 50, 300, 200);
        panel.add(areadeTexto);
    }
    
    public void Boton(){
        boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150,300, 150, 30);
        boton.setFont(new Font("Times New Roman",1,20));
        panel.add(boton);
        
        e2= new JLabel();
        e2.setBounds(50, 200, 400, 40);
        e2.setFont(new Font("Times New Roman",0,20));
        panel.add(e2);
        
        eventoOyenteDeMouse();
    }
    
    public void eventoOyenteDeMouse(){
        //Agregando oyente de raton o mouselistener
        MouseListener odm= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areadeTexto.append("Esto es un mouse clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                areadeTexto.append("MousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areadeTexto.append("MouseReleased\n");//sirve
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areadeTexto.append("MouseEntered\n");//sirve
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areadeTexto.append("MouseExited\n");
            }
        };
        boton.addMouseListener(odm);
    }
    
}
