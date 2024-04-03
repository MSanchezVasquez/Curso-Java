/*Una compañia de venta de carros usados, paga a su personal de ventas un salario
de $1000 mensuales, mas una comision de $150 por cada carro vendido, mas el 5% del
valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora
los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un
vendedor dado.
 */
package pkg14.salariomensualdeunvendedordecarros;

import java.util.Scanner;

public class SalarioMensualDeUnVendedorDeCarros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int carrosVendidos;
        double salario = 1000,  comision;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Cuantos carros ha vendido?");
        carrosVendidos = entrada.nextInt();
        
        comision = carrosVendidos * 150;
 
        salario = salario + comision;
        System.out.println("El salario de " + nombre + " es de : " + salario);
    }  
}
