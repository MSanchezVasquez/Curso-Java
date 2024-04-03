/*Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca un 0.
 */
package pkg36.positivoonegativo;

import javax.swing.JOptionPane;

public class PositivoONegativo {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        while(numero != 0){
            if(numero>0){
                JOptionPane.showMessageDialog(null, "Numero positivo");
            }else{
                JOptionPane.showMessageDialog(null, "Numero negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
        }
    }  
}
