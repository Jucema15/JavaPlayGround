public interface Traductor {
    void traducir();

    default void iniciarTraductor(){
        System.out.println("Iniciando traductor... ");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor a Frances... ");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        System.out.println();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}