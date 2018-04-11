/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalvideos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author melip
 */
public class Licencia extends JFrame implements ActionListener, ChangeListener{
    
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    String nombre="";
    
    public Licencia(){
    
        setLayout(null);
        setTitle("Licencia de uso");
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\melip\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalVideos\\images\\icon.png");
        setIconImage(imagen1.getImage());
        Bienvenida b = new Bienvenida();
        nombre = b.texto; 
                
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono",0,9));
        textArea.setText("Terminos y condiciones");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10,40,575,200);
        add(scrollPane);
        
        check1 = new JCheckBox("Yo " +nombre+" acepto.");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);
        
        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
        
        boton2 = new JButton("No acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);
        
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\melip\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalVideos\\images\\coca-cola.png");
        label2 = new JLabel(imagen2);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
        
               
    }
    
    public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true)
    {
        boton1.setEnabled(true);
        boton2.setEnabled(false);
    }
    else {
    
        boton1.setEnabled(false);
        boton2.setEnabled(true);
    }
        
    }
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
        Principal ventanaP = new Principal();
        ventanaP.setBounds(0, 0, 640, 535);
        ventanaP.setVisible(true);
        ventanaP.setResizable(false);
        ventanaP.setLocationRelativeTo(null);
        
        this.setVisible(false);
    
    }
    else if (e.getSource() == boton2){
        Bienvenida ventanaB = new Bienvenida();
        ventanaB.setBounds(0, 0, 350, 450);
        ventanaB.setVisible(true);
        ventanaB.setResizable(false);
        ventanaB.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }
    
    
    }
            
}
