/*En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
¿Cual sera la cantidad que pagara una persona por su compra?
 */
package pkg24.descuento;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float monto, descuento, totalAPagar;
        System.out.println("Digita la cantidad de su compra");
        monto = entrada.nextFloat();
        if(monto>300){
            descuento = monto*0.20f;
            totalAPagar = monto - descuento;
            System.out.println("Felicidades, tienes descuento del 20%.");
            System.out.println("En vez de "+monto+" usted va a pagar: "+totalAPagar);
        }else{
            System.out.println("Lo sentimos, no tiene descuento.");
            System.out.println("Monto a pagar: "+monto);
        }
    }   
}
