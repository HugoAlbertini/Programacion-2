public class Main {
    public static void main(String[] args) {
        // crear un libro
        Libro miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);
        System.out.println("Libro creado con la siguiente información:");
        miLibro.mostrarInformacion();

        // intentar modificar el año con un valor inválido
        System.out.println("\nIntentando modificar el año con un valor inválido (-2000)...");
        miLibro.setAñoPublicacion(-2000);

        // intentar modificar el año con un valor válido
        System.out.println("\nIntentando modificar el año con un valor válido (1965)...");
        miLibro.setAñoPublicacion(1965);

        // mostrar la información final
        System.out.println("\nMostrando la información final del libro:");
        miLibro.mostrarInformacion();
    }
}