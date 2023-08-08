class ConductorPersona extends Persona implements AptoParaConducir {

    public ConductorPersona(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void verificarLicencia() {
        System.out.println("Verificando la licencia del conductor: " + getNombre());
    }

    public static void main(String[] args) {
        ConductorPersona conductor = new ConductorPersona("Juan", 30);
        conductor.imprimirDetalles();
        conductor.verificarLicencia();
    }
}
