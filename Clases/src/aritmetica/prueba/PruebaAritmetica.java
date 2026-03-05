package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica(5, 7);

        aritmetica1.setOperador1(10);
        aritmetica1.setOperador2(15);

        aritmetica1.sumar();
        aritmetica1.restar();

    }
}
