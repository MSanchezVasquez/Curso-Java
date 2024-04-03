/*Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación 
realizar la media de los números positivos, 
la media de los negativos y conteo el número de ceros.
 */
package pkg58.promediosenunarreglo;

import java.util.Scanner;

public class PromediosEnUnArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float [5];
        float sumaPos = 0, conteoPos=0, sumaNeg=0,conteoNeg=0, conteoCeros=0;
        float mediaPos, mediaNeg;
        for(int i=0; i<5; i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextFloat();
            if(numeros[i]>0){
                sumaPos+=numeros[i];
                conteoPos++;
            }else if(numeros[i]<0){
                sumaNeg += numeros[i];
                conteoNeg++;
            }else{
                conteoCeros++;
            }
        }
        
        if(conteoPos ==0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }else{
            mediaPos = sumaPos/conteoPos;
            System.out.println("La media de los numeros positivos es: "+mediaPos);
        }
        if(conteoNeg ==0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }else{
            mediaNeg = sumaNeg/conteoNeg;
            System.out.println("La media de los numeros positivos es: "+mediaNeg);
        }
        System.out.println("Numero de ceros: "+conteoCeros);
    }   
}
