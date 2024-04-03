package Ejemplo;

public class Principal {
    public static void main(String[] args) {
        //SerVivo vivo = new SerVivo();  SerVivo es abstracto, por lo cual no se puede instanciar
        
        Planta planta = new Planta();
        planta.alimentarse();
        
        //Animal animal = new Animal(); Animal es abstracto, por lo cual no se puede instanciar
        
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        animalC.alimentarse();
        
        AnimalHerviboro animalH = new AnimalHerviboro();
        animalH.alimentarse();
    }
}
