public class Main {
    public static void main(String[] args) {
        // crear una nueva mascota
        Mascota miMascota = new Mascota("Toby", "Perro", 3);

        // muestra su información inicial
        System.out.println("--- Información Inicial de la Mascota ---");
        miMascota.mostrarInfo();
        System.out.println();

        // simula el paso del tiempo (cumpleaños)
        miMascota.cumplirAnios();
        System.out.println();

        // muestra información actualizada
        System.out.println("--- Información Actualizada de la Mascota ---");
        miMascota.mostrarInfo();
    }
}