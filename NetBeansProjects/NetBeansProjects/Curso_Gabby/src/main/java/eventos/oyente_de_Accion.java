package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class oyente_de_Accion extends JFrame{
    
    JPanel panel;
    JLabel etiqueta,e2;
    JTextField cajadeTexto;
    JButton boton;
    
    
    public oyente_de_Accion() {
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        metodos();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void metodos(){
        Panel();
        Etiqueta();
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
        etiqueta.setFont(new Font("Chiller",1,20));
        panel.add(etiqueta);
    }
    
    public void CajaDeTexto(){
        cajadeTexto = new JTextField();
        cajadeTexto.setBounds(30, 50, 300, 30);
        panel.add(cajadeTexto);
    }
    
    public void Boton(){
        boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150, 100, 150, 30);
        boton.setFont(new Font("Chiller",1,30));
        panel.add(boton);
        
        e2= new JLabel();
        e2.setBounds(50, 200, 400, 40);
        e2.setFont(new Font("Times new Romans",0,20));
        panel.add(e2);
        
        
        ActionListener al= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e2.setText("Hola "+cajadeTexto.getText()+" Como Estas?");
            }
        };
        boton.addActionListener(al);
        
        
        
    }
    
    
}
