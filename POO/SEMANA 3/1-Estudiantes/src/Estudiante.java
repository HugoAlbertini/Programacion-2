public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("--------------------");
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("Se subió la calificación en " + puntos + " puntos.");
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("Se bajó la calificación en " + puntos + " puntos.");
    }
}