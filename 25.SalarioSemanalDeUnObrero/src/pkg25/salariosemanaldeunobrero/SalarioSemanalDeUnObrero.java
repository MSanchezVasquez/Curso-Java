/*
Ejercicio 5: Un obrero necesita calcular su salario semanal, 
el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por hora. 
Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y 
$20 por cada hora extra. 
 */
package pkg25.salariosemanaldeunobrero;

import javax.swing.JOptionPane;

public class SalarioSemanalDeUnObrero {
    public static void main(String[] args) {
       int horasTrabajadas;
       float salarioTotal;
       horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas:"));
       
       if(horasTrabajadas <= 40){
           salarioTotal = horasTrabajadas * 16;
       }else{
           salarioTotal = (40*16) + ((horasTrabajadas-40)*20);
       }
        JOptionPane.showMessageDialog(null, "El salario total es: "+salarioTotal);
    }  
}
