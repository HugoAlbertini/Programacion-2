public class Main {
    public static void main(String[] args) {
        // crear una nave con 50 unidades de combustible
        NaveEspacial miNave = new NaveEspacial("Explorador Alfa", 50);
        miNave.mostrarEstado();

        // despegar, intentar avanzar sin recargar
        miNave.despegar();
        System.out.println("\nIntentando avanzar 100 unidades...");
        miNave.avanzar(100); // Fallará por falta de combustible
        miNave.mostrarEstado();

        // cargar combustible
        System.out.println("\nRecargando 40 unidades de combustible...");
        miNave.recargarCombustible(40);
        miNave.mostrarEstado();

        // avanzar correctamente
        System.out.println("\nIntentando avanzar 70 unidades...");
        miNave.avanzar(70);

        // mostrar el estado final
        miNave.mostrarEstado();
    }
}