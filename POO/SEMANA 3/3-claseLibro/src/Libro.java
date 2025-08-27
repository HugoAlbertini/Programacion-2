public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // getters para todos los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // setter con validación para añoPublicacion
    public void setAñoPublicacion(int año) {
        if (año > 0) { // el año debe ser positivo
            this.añoPublicacion = año;
            System.out.println("El año de publicación se actualizo a " + año + ".");
        } else {
            System.out.println("Error: El año de publicación '" + año + "' no es un valor válido.");
        }
    }

    // metodo para mostrar la información del libro
    public void mostrarInformacion() {
        System.out.println("--- Información del Libro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de Publicación: " + this.añoPublicacion);
        System.out.println("---------------------------");
    }
}