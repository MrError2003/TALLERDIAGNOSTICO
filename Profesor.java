class Profesor extends Persona {
    private String materia;
    private double salario;

    public Profesor(String nombre, int edad, String materia, double salario) {
        super(nombre, edad);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public double getSalario() {
        return salario;
    }

    // método para imprimir detalles
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Materia: " + materia);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Pancho Villa", 45, "Historia", 50000.0);

        profesor1.imprimirDetalles();
    }
}
