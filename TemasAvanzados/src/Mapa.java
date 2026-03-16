import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Florez");
        persona.put("edad", "31");
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((k, v) -> {
            System.out.println("Llave: " + k + ", Valor: " + v);
        });
    }
}
