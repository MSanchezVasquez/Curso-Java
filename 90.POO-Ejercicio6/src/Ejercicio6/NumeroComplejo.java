package Ejercicio6;

public class NumeroComplejo {
    int real1,real2, imaginario1, imaginario2;

    public NumeroComplejo(int real1, int real2, int imaginario1, int imaginario2) {
        this.real1 = real1;
        this.real2 = real2;
        this.imaginario1 = imaginario1;
        this.imaginario2 = imaginario2;
    }
    
    public String sumar(){
        int sumaReales = real1 + real2;
        int sumaImaginarios = imaginario1+imaginario2;
        if(sumaImaginarios>0){
            return "La suma de los numeros complejos es: "+sumaReales + " + "+sumaImaginarios+"i";
        }
        return "La suma de los numeros complejos es: "+sumaReales + " "+sumaImaginarios+"i";
    }
    
    public String multiplicar(){
        int parteReal = (real1*real2)-(imaginario1*imaginario2);
        int parteImaginaria = (real1*imaginario2)+(imaginario1*real2);
        if(parteImaginaria>0){
            return "La multiplicacion de los numeros complejos es: "+parteReal + " + "+parteImaginaria+"i";
        }
        return "La multiplicacion de los numeros complejos es: "+parteReal +""+parteImaginaria+"i";
    }
}
