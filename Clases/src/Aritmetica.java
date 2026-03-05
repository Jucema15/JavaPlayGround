import javax.lang.model.type.ArrayType;

public class Aritmetica {
    int operando1;
    int operando2;

    // Constructor vacio
    public Aritmetica(){

    }

    // Constructor con argumentos
    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica(5, 7);

        aritmetica1.sumar();
        aritmetica1.restar();

    }
}
