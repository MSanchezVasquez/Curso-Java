/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
 */
package pkg47.pedir10sueldos;

import javax.swing.JOptionPane;

public class Pedir10Sueldos {
    public static void main(String[] args) {
        int sueldo, suma = 0, conteo_mayores = 0;
        for(int i = 1; i<=10; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite el "+i+"° sueldo"));
            suma = suma + sueldo;
            if(sueldo > 1000){
                conteo_mayores++;
            }
        }
        System.out.println("La suma de todos los sueldos es: "+suma);
        System.out.println("Sueldos mayores de $1000: "+conteo_mayores);
    }   
}
