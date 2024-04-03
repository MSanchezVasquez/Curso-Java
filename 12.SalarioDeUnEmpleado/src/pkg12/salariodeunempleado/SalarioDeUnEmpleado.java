/*Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
de sus horas semanales trabajadas y de su salario por hora*/
package pkg12.salariodeunempleado;

import java.util.Scanner;

public class SalarioDeUnEmpleado {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double horasSemanales, salarioSemanal,salarioPorHora;
        System.out.println("Ingrese el salario por hora: ");
        salarioPorHora= entrada.nextDouble();
        System.out.println("Ingrese las horas semanales trabajadas: ");
        horasSemanales= entrada.nextDouble();
        
        salarioSemanal=salarioPorHora*horasSemanales;
        System.out.println("El salario semanal del trabajador es: " + salarioSemanal);
    } 
}
