public class ListaEnlazadaSimple {

    // Atributos
    private NodoLista primero;

    // Constructor
    public ListaEnlazadaSimple() {
        primero = null;
    }

    // Getter
    private NodoLista getPrimero() {
        return primero;
    }

    // Setter
    private void setPrimero(NodoLista primero) {
        this.primero = primero;
    }

    // Verifica si la lista está vacía
    private boolean estaVacia() {
        return primero == null;
    }

    // Inserta un ticket al inicio de la lista
    public void insertarInicio(Ticket ticket) {
        NodoLista nodo = new NodoLista(ticket);
        nodo.setSiguiente(primero);
        setPrimero(nodo);
    }

    // Busca un ticket por su ID
    public Ticket buscar(int id) {
    if (estaVacia()) {
        System.out.println("La lista está vacía.\n");
        return null;
    }

    NodoLista temp = getPrimero();
    while (temp != null) {
        if (temp.getTicket().getId() == id) {
            return temp.getTicket();
        }

        temp = temp.getSiguiente();
    }
    return null;
    }

    // Muestra todos los tickets resueltos
    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("No hay tickets resueltos.\n");
            return;
        }

        NodoLista temp = getPrimero();
        while (temp != null) {
            System.out.println(temp.getTicket());
            temp = temp.getSiguiente();
        }   
    }

    // Clase interna que representa cada nodo
    private class NodoLista {

        // Atributos
        private Ticket ticket;
        private NodoLista siguiente;

        // Constructor
        public NodoLista(Ticket ticket) {
            this.ticket = ticket;

            // Al crear el nodo todavía no tiene otro nodo conectado
            siguiente = null;
        }

        // Getter del ticket
        public Ticket getTicket() {
            return ticket;
        }

        // Getter del siguiente nodo
        public NodoLista getSiguiente() {
            return siguiente;
        }

        // Setter del siguiente nodo
        public void setSiguiente(NodoLista siguiente) {
            this.siguiente = siguiente;
        }
    }
}