package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
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
             JPanel panel = new JPanel(); //Creacion de un panel       
             //panel.setBackground(Color.GREEN); //Establecemos el color del panel
             panel.setLayout(null); //Desactivando el layout por defecto
             this.getContentPane().add(panel); //Agregamos el panel a la ventana   
             
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
             //Cambiar el tamaño a la imagen
             
             
         }
}

