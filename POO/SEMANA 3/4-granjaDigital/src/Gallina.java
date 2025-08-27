class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // Las gallinas empiezan sin colocar huevos
    }

    // incrementa en uno el contador de huevos puestos.
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + this.idGallina + " puso un huevo.");
    }

    // incrementa en uno la edad de la gallina.

    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + this.idGallina + " envejeció.");
    }

    // Muestra por consola el estado actual de la gallina.
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + this.idGallina);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
        System.out.println("--------------------");
    }
}