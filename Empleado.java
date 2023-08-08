public abstract class Empleado {

    private String nombre;
    private double salario;

    public Empleado(String name, double salary) {
        this.nombre = name;
        this.salario = salary;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salary) {
        this.salario = salary;
    }

    public abstract double calcularSalario();

    public abstract void mostrarDetalles();
}
