import java.util.ArrayList;

public class ColaDinamica {

    // Atributos
    private ArrayList<Ticket> cola;

    // Constructor
    public ColaDinamica() {

        // Se crea la cola vacía
        cola = new ArrayList<>();
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return cola.isEmpty();
    }

    // Inserta un ticket al final de la cola
    public void insertar(Ticket ticket) {
        cola.add(ticket);
    }

    // Elimina y devuelve el ticket que está al frente
    public Ticket eliminar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.\n");
            return null;
        }
        return cola.removeFirst();
    }

    // Permite ver el ticket que está al frente
    public Ticket verFrente() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.\n");
            return null;
        }
        return cola.getFirst();
    }
}