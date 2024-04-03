/*Pedir tres numeros y mostrarlos ordenados de mayor a menor.
 */
package pkg27.ordenar3numerosdemayoramenor;

import javax.swing.JOptionPane;

public class Ordenar3NumerosDeMayorAMenor {
    public static void main(String[] args) {
        int num1,num2,num3;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(num1>num2 && num2>num3){
            JOptionPane.showMessageDialog(null, "El orden es: "+num1 + "-"+num2+"-"+num3);
        }else if(num1>num3 && num3>num2){
            JOptionPane.showMessageDialog(null, "El orden es: "+num1 + "-"+num3+"-"+num2);
        }else if(num2>num1 && num1>num3){
            JOptionPane.showMessageDialog(null, "El orden es: "+num2 + "-"+num1+"-"+num3);
        }else if(num2>num3 && num3>num1){
            JOptionPane.showMessageDialog(null, "El orden es: "+num2 + "-"+num3+"-"+num1);
        }else if(num3>num1 && num1>num2){
            JOptionPane.showMessageDialog(null, "El orden es: "+num3 + "-"+num1+"-"+num2);
        }else if(num3>num2 && num2>num1){
            JOptionPane.showMessageDialog(null, "El orden es: "+num3 + "-"+num2+"-"+num1);
        }
    }    
}
