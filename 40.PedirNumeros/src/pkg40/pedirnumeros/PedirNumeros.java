/*Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos.
 */
package pkg40.pedirnumeros;

import javax.swing.JOptionPane;

public class PedirNumeros {
    public static void main(String[] args) {
        int numero, suma=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            suma = suma +numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros introducidos es: "+suma);
    }  
}
