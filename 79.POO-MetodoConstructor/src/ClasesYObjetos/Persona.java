package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre; 
    int edad;
    
    //Métodos
    //Método Constructor
    public Persona(String nombre, int edad /*String _nombre, int _edad*/){
        this.nombre = nombre;
        this.edad = edad;
        //Otra alternativa
        /*nombre = _nombre;
           edad = _edad;
        */
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
