/*
 Ejercicio 1: Programa que lea un número entero y muestre si el número es múltiplo de 10.
 */
package pkg21.determinarsiunnumeroesmultiplode10;

import javax.swing.JOptionPane;

public class DeterminarSiUnNumeroEsMultiploDe10 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero % 10 == 0){
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10.");
        }  
    } 
}
