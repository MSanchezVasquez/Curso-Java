package ventana;

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
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventana() {
        setTitle("Eventos"); //Establecemos el titulo de la ventana
        //setLocation(700,400); //Establecemos la posicion inicial de la ventana
        setBounds(50, 50, 500, 500); //Este metodo setBound(), incluye al setSize() y al setLocation()
        //setLocationRelativeTo(null); //Establece la ventana en el centro de la pantalla

        //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
        //setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo
        //this.getContentPane().setBackground(Color.BLACK); //Establecemos el color de la ventana
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        //colocarEtiqueta();
        //colocarCajaDeTexto();
        colocarBoton();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel(); //Creacion de un panel       
        //panel.setBackground(Color.GREEN); //Establecemos el color del panel
        panel.setLayout(null); //Desactivando el layout por defecto
        this.add(panel); //Agregamos el panel a la ventana   
    }

    private void colocarEtiqueta() {
        //Etiqueta  - etiqueta tipo texto
        JLabel etiqueta = new JLabel("Ingrese su nombre:", SwingConstants.CENTER); //Creamos una etiqueta
        //etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(30, 10, 200, 30);
        //etiqueta.setForeground(Color.BLACK); //Establecemos el color de la letra
        //etiqueta.setOpaque(true);
        //etiqueta.setBackground(Color.BLACK); //Cambiamos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("chiller", Font.PLAIN, 30));
        panel.add(etiqueta); //Agregamos la etiqueta al panel      
    }

    private void colocarCajaDeTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        panel.add(cajaTexto);
    }
    
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }

    private void colocarBoton() {
        boton = new JButton("Pulsa aqui");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));
        panel.add(saludo);

        //Agregando evento de tipo action listener
        /*ActionListener oyenteDeAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);*/
        
        eventoOyenteDeRaton();
    };  
    
    private void eventoOyenteDeRaton(){
        //Agregando oyente de raton
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }
}
