/*Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa
para gestionar las facturas. En cada factura figura: el código del artículo, 
la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: 
Facturación total, cantidad en litros vendidos del artículo 1 y 
cuantas facturas se emitieron de más de $600.
 */
package pkg50.resumendeventasdeunaempresa;

import java.util.Scanner;

public class ResumenDeVentasDeUnaEmpresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, litros, litrosArticulo1=0, conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal=0;
        for(int i = 1; i<=5; i++){
            System.out.println("Articulo N°"+i+"\nDigite el codigo: ");
            codigo = entrada.nextInt();
            System.out.println("Articulo N°"+i+"\nDigite la cantidad en litros: ");
            litros = entrada.nextInt();
            System.out.println("Articulo N°"+i+"\nDigite el precio por litro: ");
            precioLitro = entrada.nextFloat();
            
            importeFactura = litros * precioLitro;
            facturacionTotal += importeFactura;
            
            if(codigo==1){
                litrosArticulo1 += litros;
            }
            if(importeFactura > 600){
                conteoMas600++;
            }
        }
        
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo N°1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a 600 dolares: "+conteoMas600);
    }    
}
