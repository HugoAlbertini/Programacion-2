public class Main {
    public static void main(String[] args) {
        try {
            // crea empleados con ambos constructores
            Empleado emp1 = new Empleado(1, "Juan Pérez", "Desarrollador", 50000);
            Empleado emp2 = new Empleado("María Gómez", "Analista");

            // aplica aumentos
            emp1.actualizarSalario(10); // Aumento del 10%
            emp2.actualizarSalario(500, true); // Aumento fijo de $500

            // muestra información
            System.out.println(emp1.toString());
            System.out.println(emp2.toString());

            // muestra total de empleados
            System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}