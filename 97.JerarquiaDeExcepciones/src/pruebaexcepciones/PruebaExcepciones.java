//Excepciones verificadas(IOException) y no verificadas(RunTimeException)
package pruebaexcepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PruebaExcepciones {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*Excepciones Verificadas (IOException)
            //Lectura de un archivo de texto(.txt)
            BufferedReader bf = new BufferedReader(new FileReader("c:\\prueba\\texto.txt"));
            String linea;
            while((linea=bf.readLine())!=null){
                System.out.println(linea);
            }
         */   
       //Excepciones no verificadas(RunTimeException)
               //Division entre cero
                int n1=5, n2=0;
                int division = n1/n2;
                System.out.println(division);          
          
    } 
}
