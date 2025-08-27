public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100; // limite máximo de combustible

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, LIMITE_COMBUSTIBLE);
    }

    public void despegar() {
        System.out.println("¡La nave '" + this.nombre + "' despego!!");
    }

    public void avanzar(int distancia) {
        // se asume que 1 unidad de distancia consume 1 unidad de combustible
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println("La nave esta avanzando " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar la distancia requerida.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            this.combustible += cantidad;
            if (this.combustible > LIMITE_COMBUSTIBLE) {
                this.combustible = LIMITE_COMBUSTIBLE;
                System.out.println("Combustible recargado. El tanque está lleno.");
            } else {
                System.out.println("Se recargo " + cantidad + " unidades de combustible.");
            }
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Combustible: " + this.combustible + "/" + LIMITE_COMBUSTIBLE);
        System.out.println("-------------------------");
    }
}