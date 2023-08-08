// UNA DISCULPA, PERO AL RESOLVER EL EJERCICIO 10 TUVE DIFICULTADES YA QUE DESCONOZCO EL CONCEPTO DE HERENCIA MULTIPLE



/* interface AptoParaConducir {
    void verificarLicencia();
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Conductor implements AptoParaConducir {

    private Persona persona;

    public Conductor(String nombre, int edad) {
        this.persona = new Persona(nombre, edad);
    }

    @Override
    public void verificarLicencia() {
        System.out.println("Verificando la licencia del conductor: " + persona.getNombre());
    }

    public void imprimirDetalles() {
        persona.imprimirDetalles();
    }

    public static void main(String[] args) {
        Conductor conductor = new Conductor("Juan", 30);
        conductor.imprimirDetalles();
        conductor.verificarLicencia();
    }
} */


interface AptoParaConducir {
    void verificarLicencia();
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

abstract class ConductorPersona extends Persona implements AptoParaConducir {

    public ConductorPersona(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void verificarLicencia() {
        System.out.println("Verificando la licencia del conductor: " + getNombre());
    }
}

class Conductor extends ConductorPersona {

    public Conductor(String nombre, int edad) {
        super(nombre, edad);
    }

    public static void main(String[] args) {
        Conductor conductor = new Conductor("Juan", 30);
        conductor.imprimirDetalles();
        conductor.verificarLicencia();
    }
}
