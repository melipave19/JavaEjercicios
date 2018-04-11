/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalvideos;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author melip
 */
public class Bienvenida extends JFrame implements ActionListener{
    
    private JTextField textField;
    private JLabel label1, label2, label3, label4;
    private JButton boton;
    public static String texto="";
    
    public Bienvenida(){
    
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
                
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\melip\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalVideos\\images\\icon.png");
        setIconImage(imagen1.getImage());
        
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\melip\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalVideos\\images\\logo-coca.png");
        label1 = new JLabel(imagen2);
        label1.setBounds(25,15,300,150);
        add(label1);
        
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3,18));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        
        label4 = new JLabel("2018 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        
        textField = new JTextField();
        textField.setBounds(45,240,255,25);
        textField.setBackground(new Color(224,244,244));
        label4.setFont(new Font("Andale Mono",1,14));
        label4.setForeground(new Color(255,0,0));
        add(textField);
        
        boton = new JButton("Ingresar");
        boton.setBounds(125,280,100,30);
        boton.setBackground(new Color(255,255,255));
        boton.setFont(new Font("Andale Mono",1,14));
        boton.setForeground(new Color(255,0,0));
        boton.addActionListener(this);
        add(boton);
    }
    
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == boton){
        
            texto = textField.getText().trim(); // borrar los espacios
            if(texto.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            }
            else
            {
                Licencia ventanaL = new Licencia();
                ventanaL.setBounds(0, 0, 600, 360);
                ventanaL.setVisible(true);
                ventanaL.setResizable(false);
                ventanaL.setLocationRelativeTo(null);
                
                this.setVisible(false);
            }
            
        }
    
    }
    
}
