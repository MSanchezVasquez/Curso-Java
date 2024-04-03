/*
Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
package pkg52.pedir10numeroseindicarnegativo;

import javax.swing.JOptionPane;

public class Pedir10NumerosEIndicarNegativo {
    public static void main(String[] args) {
        int numero;
        boolean hay_negativos = false;
        
        for(int i = 1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if(numero < 0){ //Si el numero es negativo
                hay_negativos = true;
            }
        }
        if(hay_negativos == true){
            System.out.println("Si existe al menos un numero negativo.");
        }else{
            System.out.println("No existe ningun numero negativo.");
        }
    }    
}
