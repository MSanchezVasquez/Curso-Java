/*Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos.
 */
package pkg51.contaralumnosaprobadossuspensosycondicionados;

import javax.swing.JOptionPane;

public class ContarAlumnosAprobadosSuspensosYCondicionados {
    public static void main(String[] args) {
        float nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;
        for(int i = 1; i<=6; i++){
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));
            }while(nota<0 || nota>10);
            if(nota ==4){
                condicionados++;
            }else if(nota>=5){
                aprobados++;
            }else{
                suspensos++;
            }
        }
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de condicionados: "+condicionados);
        System.out.println("Cantidad de suspensos: "+suspensos);
    }   
}
