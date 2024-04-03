/*Hacer un programa que pase de Kg a otra unidad de medida de masa.
 */
package pkg33.kgaotramedidademasa;

import javax.swing.JOptionPane;

public class KgAOtraMedidaDeMasa {
    public static void main(String[] args) {
        float kilogramos, toneladas, gramos, libras, onzas;
        int opcion;
        kilogramos = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de Kilogramos que desea convertir."));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones validas\n1.Toneladas \n2.Gramo \n3.Libra \n4.Onza"));
        switch (opcion) {
            case 1:
                toneladas = kilogramos / 1000;
                JOptionPane.showMessageDialog(null, "Valor en toneladas: " + toneladas);
                break;
            case 2:
                gramos = kilogramos * 1000;
                JOptionPane.showMessageDialog(null, "Valor en gramos: " + gramos);
                break;
            case 3:
                libras = kilogramos * 2.205f;
                JOptionPane.showMessageDialog(null, "Valor en libras: " + libras);
                break;
            case 4:
                onzas = kilogramos * 35.274f;
                JOptionPane.showMessageDialog(null, "Valor en onzas: " + onzas);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
        }
    }
}
