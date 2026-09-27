import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se crea el sistema que manejará los tickets
        SistemaTickets sistema = new SistemaTickets();

        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE TICKETS =====");
            System.out.println("1. Menú de usuario");
            System.out.println("2. Menú de administrador");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                // MENÚ DE USUARIO
                case 1:
                    int opcionUsuario;

                    System.out.println("\n===== MENÚ DE USUARIO =====");
                    System.out.println("1. Crear ticket");
                    System.out.println("2. Buscar ticket resuelto");
                    System.out.println("0. Regresar");
                    System.out.print("Seleccione una opción: ");

                    opcionUsuario = entrada.nextInt();
                    entrada.nextLine();

                    if (opcionUsuario == 1) {

                        // Se solicitan los datos del nuevo ticket
                        System.out.print("Nombre completo: ");
                        String nombre = entrada.nextLine();

                        System.out.print("Descripción del ticket: ");
                        String descripcion = entrada.nextLine();

                        System.out.print("Fecha de creación: ");
                        String fechaCreacion = entrada.nextLine();

                        // Se crea y se agrega el ticket a la cola
                        sistema.crearTicket(descripcion, nombre, fechaCreacion);

                    } else if (opcionUsuario == 2) {

                        // Se busca un ticket por su ID
                        System.out.print("Ingrese el ID del ticket: ");
                        int id = entrada.nextInt();

                        sistema.buscarTicket(id);

                    } else if (opcionUsuario == 0) {
                        System.out.println("Regresando al menú principal...");

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;


                // MENÚ DE ADMINISTRADOR
                case 2:
                    int opcionAdmin;

                    System.out.println("\n===== MENÚ DE ADMINISTRADOR =====");
                    System.out.println("1. Ver ticket al frente");
                    System.out.println("2. Resolver ticket");
                    System.out.println("0. Regresar");
                    System.out.print("Seleccione una opción: ");

                    opcionAdmin = entrada.nextInt();
                    entrada.nextLine();

                    if (opcionAdmin == 1) {

                        // Se muestra el ticket que está al frente
                        sistema.verTicketFrente();

                    } else if (opcionAdmin == 2) {

                        // Primero se revisa si hay tickets pendientes
                        if (!sistema.hayTicketsPendientes()) {
                            System.out.println("La cola está vacía.");

                        } else {

                            // Solo se pide la fecha si existe un ticket
                            System.out.print("Fecha de resolución: ");
                            String fechaResolucion = entrada.nextLine();

                            // Se resuelve el ticket que está al frente
                            sistema.resolverTicket(fechaResolucion);
                        }

                    } else if (opcionAdmin == 0) {
                        System.out.println("Regresando al menú principal...");

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;


                // SALIR DEL PROGRAMA
                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                // OPCIÓN NO VÁLIDA
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
        entrada.close();
    }
}