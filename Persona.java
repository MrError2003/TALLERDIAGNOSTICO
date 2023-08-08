class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor que acepta nombre y edad como parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener la edad
    public int obtenerEdad() {
        return edad;
    }

    // Método para establecer la edad
    public void establecerEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    // Método para imprimir detalles
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        // constructor y métodos de acceso
        Persona persona1 = new Persona("Juan", 30);

        // Obtener y establecer la edad
        int edadActual = persona1.obtenerEdad();
        System.out.println("Edad actual: " + edadActual);

        persona1.establecerEdad(31);
        edadActual = persona1.obtenerEdad();
        System.out.println("Nueva edad: " + edadActual);

        // Llamar al método para imprimir detalles
        persona1.imprimirDetalles();
    }
}





