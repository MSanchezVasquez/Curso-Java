/*Ejercicio 3: Leer números hasta que se introduzca un 0. 
Para cada uno indicar si es par o impar.
 */
package pkg37.numerospareseimpares;

import javax.swing.JOptionPane;

public class NumerosParesEImpares {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero !=0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "Numero Par");
            }else{
                JOptionPane.showMessageDialog(null, "Numero Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    }   
}
