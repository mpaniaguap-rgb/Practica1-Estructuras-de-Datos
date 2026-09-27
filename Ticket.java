public class Ticket {

    // Atributos
    private static int cantidad = 0;

    private int id;
    private String descripcion;
    private String nombreCompleto;
    private String fechaCreacion;
    private String fechaResolucion;

    // Constructor
    public Ticket(String descripcion, String nombreCompleto, String fechaCreacion) {

        // Se aumenta la cantidad para generar un ID consecutivo
        cantidad++;
        id = cantidad;

        this.descripcion = descripcion;
        this.nombreCompleto = nombreCompleto;
        this.fechaCreacion = fechaCreacion;

        // Al crear el ticket todavía no está resuelto
        fechaResolucion = null;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    // Setter
    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    // Muestra la información del ticket
    @Override
    public String toString() {
        return "\nID: " + id + "\nDescripción: " + descripcion + "\nUsuario: " + nombreCompleto
                + "\nFecha de creación: " + fechaCreacion + "\nFecha de resolución: " + fechaResolucion + "\n";
    }
}