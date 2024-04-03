/*Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, 
la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
 */
package pkg48.promediodeedades.estaturasyconteos;

import javax.swing.JOptionPane;

public class PromedioDeEdadesEstaturasYConteos {
    public static void main(String[] args) {
        int edad, sumaEdad=0, mediaEdad, conteoMayor18=0, conteoMayor175=0;
        float altura, sumaAltura=0, mediaAltura;
        for(int i = 1; i<=5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno"+i+"\nDigite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno"+i+"\nDigite su estatura: "));
            sumaEdad += edad;
            sumaAltura += altura;
            if(edad>18){
                conteoMayor18++;
            }
            if(altura>1.75){
                conteoMayor175++;
            }
        }
        mediaEdad=  sumaEdad/5;
        mediaAltura = sumaAltura/5;
        
        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La altura promedio es: "+mediaAltura);
        System.out.println("Alumnos mayores a 18 años: "+conteoMayor18);
        System.out.println("Alumnos mayores a 1.75 metros: "+conteoMayor175);
        
    }   
}
