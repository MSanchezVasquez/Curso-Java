/*Ejercicio 13: Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, 
y a continuación los elementos impares.
 */
package pkg65.separarlosnumerospareseimparesdeunarreglo;

import java.util.Scanner;

public class SepararLosNumerosParesEImparesDeUnArreglo {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int arreglo [] = new int[10];
       int conteo_pares=0, conteo_impares=0;
        System.out.println("Llenar el arreglo");
       for(int i=0; i<10; i++){
           System.out.print((i+1)+". Digite un numero: ");
           arreglo[i]=entrada.nextInt();
           if(arreglo[i] % 2==0){
               conteo_pares++;
           }else{
               conteo_impares--;
           }
       }
       //Crear los arreglos siguientes
       int par[] = new int[conteo_pares];
       int impar[] = new int[conteo_impares];
       
       conteo_pares =0;
       conteo_impares =0;
       //Almacenamos los numeoros pares en su arreglo y los impares tambien
       for(int i=0; i<10; i++){
           if(arreglo[i] %2 == 0){
           par[conteo_pares] = arreglo[i];
           conteo_pares++;
           }else{
               impar[conteo_impares] = arreglo[i];
               conteo_impares++;
           }
       }
       
        System.out.print("Arreglo pares: ");
        for(int i=0; i<conteo_pares; i++){
            System.out.println(par[i]+ " - ");
        }
        System.out.print("Arreglo Impares: ");
        for(int i=0; i<conteo_impares; i++){
            System.out.println(impar[i]+ " - ");
        }       
    }   
}
