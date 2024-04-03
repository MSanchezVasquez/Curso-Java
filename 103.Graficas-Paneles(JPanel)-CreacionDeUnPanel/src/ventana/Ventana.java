package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
             
             panel.setBackground(Color.GREEN); //Establecemos el color del panel
             this.getContentPane().add(panel); //Agregamos el panel a la ventana
             
             
         }
}
