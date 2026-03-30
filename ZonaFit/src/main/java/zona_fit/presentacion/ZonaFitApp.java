package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();

    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);

        IClienteDAO clienteDao = new ClienteDAO();
        while(!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar el menu: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                *** Zona Fit (GYM)
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                """);
        var opcion = Integer.parseInt(consola.nextLine());
        return opcion;
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDao){
        var salir = false;
        switch (opcion){

            case 1 -> {
                System.out.println("--- Listado de clientes ---");
                var clientes = clienteDao.listarClientes();
                clientes.forEach(System.out::println);
            }

            case 2 ->{
                System.out.println("Introduce el id del Cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDao.buscarClientePorId(cliente);
                if (encontrado){
                    System.out.println("Cliente encontrado: " + cliente);
                }else{
                    System.out.println("Cliente no encontrado: " + cliente);
                }
            }

            case 3 ->{
                System.out.println("--- Agregar Cliente ---");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());

                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDao.agregarCliente(cliente);

                if(agregado){
                    System.out.println("Cliente agregado: " + cliente);
                }else {
                    System.out.println("Cliente no agregado: " + cliente);
                }
            }

            case 4 ->{
                System.out.println("--- Modificar Cliente ---");
                System.out.println("Id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre Cliente: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido Cliente: ");
                var apellido = consola.nextLine();
                System.out.println("Membresia Cliente: ");
                var membresia = Integer.parseInt(consola.nextLine());

                var cliente = new Cliente(idCliente, nombre, apellido, membresia);
                var modificado = clienteDao.modificarCliente(cliente);
                if(modificado){
                    System.out.println("Cliente modificado: " + cliente);
                }else {
                    System.out.println("Cliente no modificado: " + cliente);
                }
            }

            case 5 ->{
                System.out.println("--- Eliminar Cliente ---");
                System.out.println("Id Cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDao.eliminarCliente(cliente);

                if(eliminado){
                    System.out.println("Cliente eliminado: " + cliente);
                }else {
                    System.out.println("Cliente no eliminado: " + cliente);
                }
            }

            case 6 ->{
                System.out.println("¡Hasta pronto!");
                salir = true;
            }

            default -> System.out.println("Opcion no reconocida: " + opcion);
        }
        return salir;
    }
}
