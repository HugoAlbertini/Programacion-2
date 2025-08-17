import java.util.Scanner;

public class Main {

    // Variable global para el descuento
    public static double descuentoGlobal = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para el descuento aplicado
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        calcularDescuentoEspecial(precioProducto);

        scanner.close();
    }
}