public class Main {
    public static void main(String[] args) {
        // declarar y inicializar un array con los precios de algunos productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // mostrar los valores originales de los precios
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // modificar el precio de un producto específico
        // se modifica el tercer producto
        precios[2] = 129.99;

        // mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}