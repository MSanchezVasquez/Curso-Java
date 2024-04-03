/*
 Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
 */
package pkg26.verificarsiesparoimpar;

import javax.swing.JOptionPane;

public class VerificarSiEsParOImpar {
    public static void main(String[] args) {
        int num1,num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        if(num1%2 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es par.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es impar.");
        }
        
        if(num2%2 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+num2+" es par.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+num2+" es impar.");
        }
    }    
}
