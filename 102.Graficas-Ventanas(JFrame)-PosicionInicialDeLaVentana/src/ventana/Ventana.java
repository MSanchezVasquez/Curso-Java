package ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame{
         public Ventana(){
             setSize(500, 500); //Establecemos el tamaño de la ventana
             setTitle("El mejor programa"); //Establecemos el titulo de la ventana
             //setLocation(700,400); //Establecemos la posicion inicial de la ventana
             //setBounds(800 ,300, 500, 500); //Este metodo setBound(), incluye al setSize() y al setLocation()
             setLocationRelativeTo(null); //Establece la ventana en el centro de la pantalla
             
             setDefaultCloseOperation(EXIT_ON_CLOSE);
         }   
}

