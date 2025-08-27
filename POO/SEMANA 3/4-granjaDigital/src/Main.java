public class Main {

    public static void main(String[] args) {
        // crear dos gallinas
        Gallina gallina1 = new Gallina(101, 1);
        Gallina gallina2 = new Gallina(102, 2);

        System.out.println("--- Estado Inicial ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        // simular acciones
        System.out.println("\n--- Simulación ---");
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.ponerHuevo();

        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();

        // muestra estado final
        System.out.println("\n--- Estado Final ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}