/* Ejercicio 4: Construir un programa para una competencia de atletismo, 
el programa debe gestionar una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera,
al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
package Ejercicio4;

public class Atleta {
    private int numeroAtleta, tiempo;
    private String nombre;

    public Atleta(int numeroAtleta, int tiempo, String nombre) {
        this.numeroAtleta = numeroAtleta;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }
    
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nNumero de atleta: "+numeroAtleta+"\nTiempo: "+tiempo+" segundos";
    }
}
