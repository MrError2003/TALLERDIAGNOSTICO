public class Desarrollador extends Empleado {

    private int horasExtra;
    private double tarifaHoraExtra;

    public Desarrollador(String nombre, double salario, int horasExtra, double tarifaHoraExtra) {
        super(nombre, salario);
        this.horasExtra = horasExtra;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + (horasExtra * tarifaHoraExtra);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Desarrollador:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalario());
        System.out.println("Horas Extra: " + horasExtra);
        System.out.println("Tarifa Hora Extra: " + tarifaHoraExtra);
        System.out.println("Salario total: " + calcularSalario());
    }

    public static void main(String[] args) {
        Desarrollador desarrollador = new Desarrollador("Calamardo", 40000.0, 10, 20.0);
        desarrollador.mostrarDetalles();
    }
}

