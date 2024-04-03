package ClasesYObjetos;

public class Operacion {
    //Atributos
    int suma, resta, multi, divi;
    
    //Métodos
    //Método para sumar ambos numeros
    public void sumar(int numero1, int numero2){
        suma = numero1+numero2;
    }
    //Método para restar ambos numeros
    public void restar(int numero1, int numero2){
        resta = numero1-numero2;
    }
    //Método para sumar ambos numeros
    public void multiplicar(int numero1, int numero2){
        multi = numero1*numero2;
    }
    //Método para sumar ambos numeros
    public void dividir(int numero1, int numero2){
        divi = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multi);
        System.out.println("La división es: "+divi);
    }
}
