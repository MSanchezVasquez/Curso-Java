//Declaración de las excepciones de un método
package pruebaexcepciones;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class PruebaExcepciones {
    
    public void leerArchivo() throws FileNotFoundException{
        File archivo = new File("c:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
    }
    
    public void leerArchivo2() throws FileNotFoundException{
        leerArchivo();
    }
    
    public static void main(String[] args) {
        
    }
}
