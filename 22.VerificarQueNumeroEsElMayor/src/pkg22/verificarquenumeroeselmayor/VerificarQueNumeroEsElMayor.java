/*
 Pedir dos numeros y decir cual es el mayor o si son iguales
 */
package pkg22.verificarquenumeroeselmayor;

import javax.swing.JOptionPane;

public class VerificarQueNumeroEsElMayor {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El numero " + num1 + " es mayor al numero " + num2);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "El numero " + num2 + " es mayor al numero " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es igual al numero "+num2);
        }
    }
}
