/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalvideos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author melip
 */
public class Principal extends JFrame implements ActionListener{
    
    private JMenuBar menuBar;
    private JMenu menuOpciones,menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
    private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,labelDepartamento,labelAntiguedad,labelResultado, labelFooter;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JTextArea textArea;
    private JScrollPane scrollPane;  
    String nombre="";
          
    
    public Principal(){
    
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        
        
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\melip\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalVideos\\images\\icon.png");
        setIconImage(imagen1.getImage());
        
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,0,0));
        setJMenuBar(menuBar);
        
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        menuBar.add(menuOpciones);
        
        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        menuBar.add(menuCalcular);
        
        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1,14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        menuBar.add(menuAcercaDe);
        
        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);
        
        miCalculo = new JMenuItem("Calcular");
        miCalculo.setFont(new Font("Andale Mono",1,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);
        
        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);
        
        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);
        
        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);
        
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        
        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        
        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono",1,14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);
        
        ImageIcon imagen = new ImageIcon("C:\\Users\\melip\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalVideos\\images\\logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);
        
        Bienvenida b = new Bienvenida();
        nombre = b.texto;
        labelBienvenido = new JLabel("Bienvenido/a "+ nombre);
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);
        
        labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono",0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);
        
        labelNombre = new JLabel("Nombre Completo:");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);
        
        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtNombreTrabajador);
        
        labelAPaterno = new JLabel("Apellido Paterno");
        labelAPaterno.setBounds(25, 248, 180, 25);
        labelAPaterno.setFont(new Font("Andale Mono",1,12));
        labelAPaterno.setForeground(new Color(255,255,255));
        add(labelAPaterno);
        
        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtAPaternoTrabajador);
        
        labelAMaterno = new JLabel("Apellido Materno");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono",1,12));
        labelAMaterno.setForeground(new Color(255,255,255));
        add(labelAMaterno);
        
        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtAMaternoTrabajador);
        
        labelDepartamento= new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);
        
        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new java.awt.Color(224,224,244));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new java.awt.Color(255,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento de Logistica");
        comboDepartamento.addItem("Departamento de Gerencia");
        
        labelAntiguedad= new JLabel("Selecciona la Antiguedad:");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);
        
        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new java.awt.Color(224,224,244));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 años o mas de servicio");
    
        labelResultado= new JLabel("Resultado del Cálculo:");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);
        
        textArea = new JTextArea();
        textArea.setEnabled(false);
        textArea.setBackground(new Color(224,224,244));
        textArea.setFont(new Font("Andale Mono",1,11));
        textArea.setForeground(new Color(255,0,0));
        textArea.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(220, 333, 385, 90);
        add(scrollPane);
        
        labelFooter = new JLabel("2018 The Coca-Cola Company - Todos los derechos reservados");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelFooter.setForeground(new java.awt.Color(255,255,255));
        add(labelFooter);
    }
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == miCalculo){
        textArea.setEnabled(true);
        textArea.setText("");
        String departSelect = comboDepartamento.getSelectedItem().toString();
        String antiSelect = comboAntiguedad.getSelectedItem().toString();
        if(departSelect.equals("Atencion al Cliente")){
            if(antiSelect.equals("1 año de servicio"))
            {
                textArea.setText("\n Estimado " + nombre + " le corresponden 6 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            else if(antiSelect.equals("2 a 6 años de servicio")){
            
                textArea.setText("\n Estimado " + nombre + " le corresponden 14 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            else if(antiSelect.equals("7 años o mas de servicio")){
            
                textArea.setText("\n Estimado " + nombre + " le corresponden 20 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
        else if(departSelect.equals("Departamento de Logistica")){
            if(antiSelect.equals("1 año de servicio"))
            {
                textArea.setText("\n Estimado " + nombre + " le corresponden 7 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            else if(antiSelect.equals("2 a 6 años de servicio")){
            
                textArea.setText("\n Estimado " + nombre + " le corresponden 15 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            else if(antiSelect.equals("7 años o mas de servicio")){
            
                textArea.setText("\n Estimado " + nombre + " le corresponden 22 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }}
        else if(departSelect.equals("Departamento dde Gerencia")){
            if(antiSelect.equals("1 año de servicio"))
            {
                textArea.setText("\n Estimado " + nombre + " le corresponden 10 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            else if(antiSelect.equals("2 a 6 años de servicio")){
            
                textArea.setText("\n Estimado " + nombre + " le corresponden 20 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            else if(antiSelect.equals("7 años o mas de servicio")){
            
                textArea.setText("\n Estimado " + nombre + " le corresponden 30 días de vacaciones. "
                        + "\n Por ser del área de " +departSelect+" y contar con " + antiSelect);
            }
            }
        }
    
    }
    if(e.getSource() == miRojo){
    
    }
    if(e.getSource() == miNegro){
    
    }
    if(e.getSource() == miMorado){
    
    }
    if(e.getSource() == miNuevo){
    
    }
    if(e.getSource() == miSalir){
    
    }
    if(e.getSource() == miElCreador){
    
    }
    }
    
}
