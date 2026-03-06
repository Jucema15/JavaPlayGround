package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal{

    // Método polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase Padre (Animal)
        var animal = new Animal();
        imprimirSonido(animal);
        var perro = new Perro();
        System.out.println();
        imprimirSonido(perro);
        var gato = new Gato();
        System.out.println();
        imprimirSonido(gato);
    }
}