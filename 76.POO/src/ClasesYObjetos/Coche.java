//Creación de Clases y Objetos
package ClasesYObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main(String[]args){
        Coche coche1 = new Coche();
        coche1.color = "Rojo";
        coche1.marca = "Audi";
        coche1.km = 0;
        System.out.println("El color de coche 1 es: "+coche1.color);
        System.out.println("La marca de coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje de coche 1 es: "+coche1.km);
        
        Coche coche2 = new Coche();
        coche2.color = "Blanco";
        coche2.marca = "Mercedes Benz";
        coche2.km = 100;
        System.out.println("\nEl color de coche 2 es: "+coche2.color);
        System.out.println("La marca de coche 2 es: "+coche2.marca);
        System.out.println("El kilometraje de coche 2 es: "+coche2.km);
    }
}
