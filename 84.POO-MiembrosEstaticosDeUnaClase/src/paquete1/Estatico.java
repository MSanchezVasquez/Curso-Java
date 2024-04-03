//Miembros estáticos de una clase
package paquete1;

public class Estatico {
    private static String frase = "Primera frase";
    
    public static int sumar (int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    
    public static void main(String[] args) {
        /*Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase"; //Cualquier cambio que hagas en un objeto va a repercutir en todos los objetos creados de la clase.
        
        System.out.println(ob1.frase); //IMPRIMIRA "Segunda frase"
        System.out.println(ob2.frase);*/ //IMPRIMIRA "Segunda frase"
        
        System.out.println(Estatico.frase); //La clase tambien es dueña del atributo.
        
        System.out.println("La suma es: "+Estatico.sumar(3, 4)); //La clase tambien es dueña del metodo.
    }
}
