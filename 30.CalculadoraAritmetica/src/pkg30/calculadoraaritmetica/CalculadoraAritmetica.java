/*Ejercicio 11:  Construir un programa que simule el funcionamiento de una calculadora
que puede realizar las  cuatro operaciones aritméticas básicas (suma, resta, producto y división) 
con valores numéricos enteros. 
El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea 
de comandos: 
S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
 */
package pkg30.calculadoraaritmetica;

import javax.swing.JOptionPane;

public class CalculadoraAritmetica {

    public static void main(String[] args) {
        int n1, n2, suma, resta, mult, div;
        char operacion;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar").charAt(0);

        switch (operacion) {
            case 's':
            case 'S':
                suma = n1 + n2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = n1 - n2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                mult = n1 * n2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + mult);
                break;
                case 'd':
            case 'D':
                div = n1 / n2;
                JOptionPane.showMessageDialog(null, "La division es: " + div);
                break;
            default: JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion.");
        }
    }
}
