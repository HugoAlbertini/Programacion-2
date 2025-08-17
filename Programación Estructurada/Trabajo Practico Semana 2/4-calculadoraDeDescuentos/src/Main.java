import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double porcentajeDescuento = 0;

        switch (categoria) {
            case 'A':
                porcentajeDescuento = 0.10;
                break;
            case 'B':
                porcentajeDescuento = 0.15;
                break;
            case 'C':
                porcentajeDescuento = 0.20;
                break;
            default:
                System.out.println("Categoría no válida. No se aplicará ningún descuento.");
                break;
        }

        double montoDescuento = precio * porcentajeDescuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + precio);
        if (porcentajeDescuento > 0) {
            System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        }
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}