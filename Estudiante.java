class Estudiante extends Persona {

    // Atributo adicional
    private int numeroEstudiante;

    // Constructor de la subclase
    public Estudiante(String nombre, int edad, int numeroEstudiante) {
        super(nombre, edad);
        this.numeroEstudiante = numeroEstudiante;
    }

    //obtener el número de estudiante
    public int obtenerNumeroEstudiante() {
        return numeroEstudiante;
    }

    //número de estudiante
    public void establecerNumeroEstudiante(int nuevoNumero) {
        numeroEstudiante = nuevoNumero;
    }

    // Método para imprimir detalles
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Número de Estudiante: " + numeroEstudiante);
    }

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Ana", 20, 12345);

        int numeroActual = estudiante1.obtenerNumeroEstudiante();
        System.out.println("Número de estudiante actual: " + numeroActual);

        estudiante1.establecerNumeroEstudiante(54321);
        numeroActual = estudiante1.obtenerNumeroEstudiante();
        System.out.println("Nuevo número de estudiante: " + numeroActual);

        //método imprimir detalles
        estudiante1.imprimirDetalles();
    }

}


