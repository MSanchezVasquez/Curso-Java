package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Métodos
    //Métodos Constructores
    public Persona(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }
    public Persona(String _dni) {
        dni = _dni;
    }   
    
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton.");
    }
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros.");
    }
}
