/*Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero 
y actualice su posición dentro del mismo. 
Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto 
dentro del tablero.
 */
package Ejercicio2;

public class Posicion {
    //Atributos
    private int ejeX, ejeY;

    //Metodos
    //Constructor
    public Posicion(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    //Mover hacia arriba
    public void moverArriba(){
        ejeY += 1;
        System.out.println("DIRECCION HACIA ADELANTE");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia abajo
    public void moverAbajo(){
        ejeY -= 1;
        System.out.println("DIRECCION HACIA ABAJO");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia derecha
    public void moverDerecha(){
        ejeX += 1;
        System.out.println("DIRECCION HACIA DERECHA");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia izquierda
    public void moverIzquierda(){
        ejeX -= 1;
        System.out.println("DIRECCION HACIA IZQUIERDA");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    
    //Getter posicion X
    public int getEjeX(){
        return ejeX;
    }
    //Getter posicion Y
    public int getEjeY(){
        return ejeY;
    }
}
