class Curso {
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public Curso(int capacidadMaxima) {
        estudiantes = new Estudiante[capacidadMaxima];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("El curso está completo, no se puede agregar más estudiantes.");
        }
    }

    public double calcularPromedioEdades() {
        if (cantidadEstudiantes == 0) {
            return 0.0;
        }

        int sumaEdades = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            sumaEdades += estudiantes[i].obtenerEdad();
        }

        return (double) sumaEdades / cantidadEstudiantes;
    }

    public void mostrarDetallesEstudiantes() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes en el curso.");
            return;
        }

        System.out.println("Detalles de los estudiantes en el curso:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            estudiantes[i].imprimirDetalles();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Curso cursoProgramacion = new Curso(5);

        Estudiante estudiante1 = new Estudiante("Ana", 20, 12345);
        Estudiante estudiante2 = new Estudiante("Juan", 21, 54321);
        Estudiante estudiante3 = new Estudiante("María", 19, 98765);

        cursoProgramacion.agregarEstudiante(estudiante1);
        cursoProgramacion.agregarEstudiante(estudiante2);
        cursoProgramacion.agregarEstudiante(estudiante3);

        double promedioEdades = cursoProgramacion.calcularPromedioEdades();
        System.out.println("Promedio de edades: " + promedioEdades);

        cursoProgramacion.mostrarDetallesEstudiantes();
    }
}
