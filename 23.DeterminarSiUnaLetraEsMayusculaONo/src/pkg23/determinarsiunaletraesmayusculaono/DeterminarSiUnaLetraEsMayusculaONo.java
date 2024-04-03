/*Ejercicio 3: Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
*/
package pkg23.determinarsiunaletraesmayusculaono;

import javax.swing.JOptionPane;

public class DeterminarSiUnaLetraEsMayusculaONo {
    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }    
}
