package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
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

public class Ventana extends JFrame{
    
    JPanel panel;
         public Ventana(){
             setSize(500, 500); //Establecemos el tamaño de la ventana
             setTitle("El mejor programa"); //Establecemos el titulo de la ventana
             //setLocation(700,400); //Establecemos la posicion inicial de la ventana
             //setBounds(800 ,300, 500, 500); //Este metodo setBound(), incluye al setSize() y al setLocation()
             setLocationRelativeTo(null); //Establece la ventana en el centro de la pantalla
             
             //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
             setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo
             
             //this.getContentPane().setBackground(Color.BLACK); //Establecemos el color de la ventana
             
             iniciarComponentes();
             
             setDefaultCloseOperation(EXIT_ON_CLOSE);
         }   
         
         private void iniciarComponentes(){       
             colocarPaneles();
             //colocarEtiquetas();
             //colocarBotones();
             //colocarRadioBotones();
             //colocarCajasDeTexto();
             //colocarAreasDeTexto();
             colocarListasDesplegables();
         }
         
         private void colocarPaneles(){
             panel = new JPanel(); //Creacion de un panel       
             //panel.setBackground(Color.GREEN); //Establecemos el color del panel
             panel.setLayout(null); //Desactivando el layout por defecto
             this.getContentPane().add(panel); //Agregamos el panel a la ventana   
         }
         
         private void colocarEtiquetas(){
             //Etiqueta  - etiqueta tipo texto
             JLabel etiqueta = new JLabel("Mundial 2026", SwingConstants.CENTER); //Creamos una etiqueta
             //etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
             etiqueta.setBounds(85, 10, 300, 80);
             etiqueta.setForeground(Color.BLACK); //Establecemos el color de la letra
             //etiqueta.setOpaque(true);
             //etiqueta.setBackground(Color.BLACK); //Cambiamos el color del fondo de la etiqueta
             etiqueta.setFont(new Font("chiller", Font.PLAIN, 30));
             panel.add(etiqueta); //Agregamos la etiqueta al panel      
             
             //Etiqueta 2 - etiqueta tipo imagen
             ImageIcon imagen = new ImageIcon("balon.jfif");
             JLabel etiqueta2 = new JLabel();
             etiqueta2.setBounds(10,80,580,330);
             etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(465, 300, Image.SCALE_SMOOTH)));
             panel.add(etiqueta2);
         }
         
         private void colocarBotones(){
             //Boton 1 - boton de texto
             JButton boton1 = new JButton();
             boton1.setText("CLICK"); //Establecemos un texto al boton
             boton1.setBounds(100,100, 100,40);
             boton1.setEnabled(true);
             boton1.setMnemonic('a'); //Establecemos alt + letra
             boton1.setForeground(Color.BLUE);
             boton1.setFont(new Font("cooper black", Font.PLAIN, 20));
             panel.add(boton1);
             
             //Boton 2 - boton de imagen
             JButton boton2 = new JButton();
             boton2.setBounds(100,200, 100,40);
             ImageIcon click = new ImageIcon("descarga.png");
             boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
             boton2.setBackground(Color.GRAY); //Establecemos el color de fondo
             panel.add(boton2);
             
             //Boton 3 - boton de bordes
             JButton boton3 = new JButton();
             boton3.setBounds(100,300,110,50);
             boton3.setBorder(BorderFactory.createLineBorder(Color.ORANGE,4,false));
             panel.add(boton3);         
         }
         
         private void colocarRadioBotones(){
             JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true);
             radioBoton1.setBounds(50, 100, 200, 50);
             radioBoton1.setEnabled(true); //
             radioBoton1.setText("Programacion");
             radioBoton1.setFont(new Font("cooper black", 0,20));
             panel.add(radioBoton1);
             
             JRadioButton radioBoton2 = new JRadioButton("Opcion 2",false);
             radioBoton2.setBounds(50, 150, 100, 50);
             panel.add(radioBoton2);
             
             JRadioButton radioBoton3 = new JRadioButton("Opcion 3",false);
             radioBoton3.setBounds(50, 200, 100, 50);
             panel.add(radioBoton3);
             
             ButtonGroup grupoRadioBotones = new ButtonGroup();
             grupoRadioBotones.add(radioBoton1);
             grupoRadioBotones.add(radioBoton2);
             grupoRadioBotones.add(radioBoton3);
         }
         
         private void colocarCajasDeTexto(){
             JTextField cajaTexto = new JTextField();
             cajaTexto.setBounds(50,50,100,30);
             cajaTexto.setText("Hola...");
             
             System.out.println("Texto en la caja: "+cajaTexto.getText());
             panel.add(cajaTexto);
         }
         
         private void colocarAreasDeTexto(){
             JTextArea areaTexto = new JTextArea();
             areaTexto.setBounds(20, 20, 300, 200);
             areaTexto.setText("Escriba el texto aqui...");
             areaTexto.append("\nEscribe por aqui"); //Añade mas texto al area
             areaTexto.setEditable(true); //Editar el area de texto
             
             System.out.println("El texto es: "+areaTexto.getText());
             panel.add(areaTexto);
         }
         
         private void colocarListasDesplegables(){
             String [] paises = {"Perú", "Colombia", "Paraguay", "Ecuador"};
             JComboBox listaDesplegable = new JComboBox(paises);
             listaDesplegable.setBounds(20,20,100,30);
             
             listaDesplegable.addItem("Argentina");
             listaDesplegable.setSelectedItem("Paraguay");
             panel.add(listaDesplegable);
         }
}

