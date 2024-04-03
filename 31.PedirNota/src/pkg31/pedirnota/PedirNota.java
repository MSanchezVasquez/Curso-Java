/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable
y Sobresaliente.
 */
package pkg31.pedirnota;

import javax.swing.JOptionPane;

public class PedirNota {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota: "));

        switch (nota) {
            case 0:
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "Nota Insuficiente");
                break;
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, "Nota Suficiente");
                break;
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null, "Bien");
                break;
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "Nota Notable");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Nota Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La nota debe esta en el rango de 0 a 10.");
                break;
        }
    }
}
