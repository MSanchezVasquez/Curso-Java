//Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene

package pkg28.pedirunnumeroydecircifras;

import javax.swing.JOptionPane;

public class PedirUnNumeroYDecirCifras {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if(num<10){
            JOptionPane.showMessageDialog(null, "El numero: "+num+" tiene 1 cifra");
        }else if(num>9 && num<100){
            JOptionPane.showMessageDialog(null, "El numero: "+num+" tiene 2 cifras");
        }else if(num>99 && num<1000){
            JOptionPane.showMessageDialog(null, "El numero: "+num+" tiene 3 cifras");
        }else if(num>999 && num < 10000){
            JOptionPane.showMessageDialog(null, "El numero: "+num+" tiene 4 cifras");
        }else if(num>9999 && num < 100000){
            JOptionPane.showMessageDialog(null, "El numero: "+num+" tiene 5 cifras");
        }else{
            JOptionPane.showMessageDialog(null, "Numero fuera de rango");
        }
    }  
}
