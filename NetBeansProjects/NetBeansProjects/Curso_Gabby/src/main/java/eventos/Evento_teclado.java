package eventos;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Evento_teclado extends JFrame{
    JPanel panel;
    JLabel etiqueta,e2;
    JTextArea areadeTexto;
    JButton boton;
    JTextArea ct;
    JTextField cajadeTexto;
    
    public Evento_teclado() {
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        metodos();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void metodos(){
        Panel();
        Etiqueta();
        AreaDeTexto();
        CajaDeTexto();
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
        areadeTexto.setBounds(150, 50, 300, 200);
        panel.add(areadeTexto);
    }
    
    public void CajaDeTexto(){
        cajadeTexto = new JTextField();
        cajadeTexto.setBounds(30, 50, 100, 30);
        panel.add(cajadeTexto);
        
        eventoOyenteDeTeclado();
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
        
        
    }
    
    public void eventoOyenteDeTeclado(){
        
        KeyListener kl=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //areadeTexto.append("KeyTyped\n"+cajadeTexto.getText()+"\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //areadeTexto.append("KeyPressed\n"+cajadeTexto.getText()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //areadeTexto.append("KeyReleased\n"+cajadeTexto.getText()+"\n");
                if(e.getKeyChar()=='p'){
                    areadeTexto.append("Se selecciono la letra p");
                }
            }
        };
        
        cajadeTexto.addKeyListener(kl);
    }
}
