public class SistemaTickets {

    // Cola donde se guardan los tickets pendientes
    private ColaDinamica colaPendientes;

    // Lista donde se guardan los tickets resueltos
    private ListaEnlazadaSimple listaResueltos;

    // Constructor
    public SistemaTickets() {
        colaPendientes = new ColaDinamica();
        listaResueltos = new ListaEnlazadaSimple();
    }

    // Verifica si existen tickets pendientes
    public boolean hayTicketsPendientes() {
        return !colaPendientes.estaVacia();
    }

    // Crea un nuevo ticket y lo agrega a la cola
    public void crearTicket(String descripcion, String nombreCompleto,
            String fechaCreacion) {

        Ticket ticket = new Ticket(descripcion, nombreCompleto, fechaCreacion);
        colaPendientes.insertar(ticket);
        System.out.println("\nTicket creado correctamente.");
        System.out.println("ID del ticket: " + ticket.getId());
    }

    // Muestra el ticket que está al frente de la cola
    public void verTicketFrente() {
        Ticket ticket = colaPendientes.verFrente();
        if (ticket != null) {
            System.out.println("Ticket al frente de la cola:");
            System.out.println(ticket);
        }
    }

    // Resuelve el ticket que está al frente
    public void resolverTicket(String fechaResolucion) {
        Ticket ticket = colaPendientes.eliminar();
        if (ticket == null) {
            return;
        }

        // Se coloca la fecha en que se resolvió
        ticket.setFechaResolucion(fechaResolucion);

        // El ticket pasa de la cola a la lista de resueltos
        listaResueltos.insertarInicio(ticket);
        System.out.println("\nTicket resuelto correctamente.");
        System.out.println(ticket);
    }

    // Busca un ticket por su ID
    public void buscarTicket(int id) {
        Ticket ticket = listaResueltos.buscar(id);
        if (ticket != null) {
            System.out.println("Ticket encontrado:");
            System.out.println(ticket);
        } else {

            // Si no está en los resueltos, se indica que está pendiente
            System.out.println("El ticket está pendiente.");
        }
    }

    // Muestra todos los tickets resueltos
    public void mostrarTicketsResueltos() {
        listaResueltos.mostrarLista();
    }
}