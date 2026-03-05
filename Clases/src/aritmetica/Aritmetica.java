package aritmetica;

public class Aritmetica {
    private int operador1;
    private int operador2;

    // Constructor vacio
    public Aritmetica(){

    }

    // Constructor con argumentos
    public Aritmetica(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public void sumar(){
        var resultado = this.operador1 + this.operador2;
        System.out.println("Resultado Suma: " + resultado);
    }

    public void restar(){
        var resultado = this.operador1 - this.operador2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public int getOperador1(){
        return this.operador1;
    }

    public int getOperador2(){
        return this.operador2;
    }

    public void setOperador1(int operador1){
        this.operador1 = operador1;
    }

    public void setOperador2(int operador2){
        this.operador2 = operador2;
    }
}
