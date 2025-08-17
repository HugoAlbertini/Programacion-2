public class Main {

    public static void imprimirPrecios(double[] precios, int indice) {
        // Caso base: si el índice es igual o mayor a la longitud del array, la recursión termina
        if (indice >= precios.length) {
            return;
        }

        // Imprime el precio en el índice actual.
        System.out.println("Precio: $" + precios[indice]);

        // Llamada recursiva para el siguiente elemento del array.
        imprimirPrecios(precios, indice + 1);
    }

    public static void main(String[] args) {
        // declarar y inicializar un array con los precios.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // usar una función recursiva para mostrar los precios originales.
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        // modificar el precio de un producto específico, el tercer producto
        precios[2] = 129.99;

        // usar la función recursiva de nuevo para mostrar los valores modificados.
        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }
}