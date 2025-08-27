public class Main {
    public static void main(String[] args) {
        // instanciar un estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación II", 85.5);

        // mostrar su información inicial
        System.out.println("Información inicial del estudiante:");
        estudiante1.mostrarInfo();

        // aumentar calificación
        estudiante1.subirCalificacion(5.0);
        System.out.println("\nInformación después de subir calificación:");
        estudiante1.mostrarInfo();

        // disminuir calificación
        estudiante1.bajarCalificacion(2.5);
        System.out.println("\nInformación después de bajar calificación:");
        estudiante1.mostrarInfo();
    }
}