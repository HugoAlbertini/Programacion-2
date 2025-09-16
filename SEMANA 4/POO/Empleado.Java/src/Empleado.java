public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto (id, salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0;
        totalEmpleados++;
    }

    // metodo sobrecargado: aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario *= (1 + porcentaje / 100);
    }

    // metodo sobrecargado: aumento por monto fijo
    public void actualizarSalario(double montoFijo, boolean esMontoFijo) {
        if (esMontoFijo) {
            this.salario += montoFijo;
        }
    }

    // metodo toString
    @Override
    public String toString() {
        return "ID: " + this.id +
                ", Nombre: " + this.nombre +
                ", Puesto: " + this.puesto +
                ", Salario: $" + String.format("%.2f", this.salario);
    }

    // metodo estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public static int getTotalEmpleados() { return totalEmpleados; }
}