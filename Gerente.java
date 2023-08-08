public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bono;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Gerente:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bono: " + bono);
        System.out.println("Salario total: " + calcularSalario());
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alcides", 60000.0, 10000.0);
        gerente.mostrarDetalles();
    }
}
