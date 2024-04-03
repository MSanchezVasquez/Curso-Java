/*Pedir numeros hasta que se teclee uno negativo, y mostrar cuentos numeros se han introducido
 */
package pkg38.pedirnumeros;

import javax.swing.JOptionPane;

public class PedirNumeros {
    public static void main(String[] args) {
        int numero, contador=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero>=0){
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "Cantidad de numeros introducidos: "+contador);
    }  
}
