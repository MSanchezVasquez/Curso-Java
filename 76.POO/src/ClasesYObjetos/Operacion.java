package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int numero1, numero2, suma, resta, multi, divi;
    
    //Métodos
    //Método para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }
    //Método para sumar ambos numeros
    public void sumar(){
        suma = numero1+numero2;
    }
    //Método para restar ambos numeros
    public void restar(){
        resta = numero1-numero2;
    }
    //Método para sumar ambos numeros
    public void multiplicar(){
        multi = numero1*numero2;
    }
    //Método para sumar ambos numeros
    public void dividir(){
        divi = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multi);
        System.out.println("La división es: "+divi);
    }
}
