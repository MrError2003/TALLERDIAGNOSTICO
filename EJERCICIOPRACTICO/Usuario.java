package EJERCICIOPRACTICO;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String dni;
    private List<Libro> librosPrestados;
    private int maxLibrosPrestados;

    public Usuario(String nombre, String dni, int maxLibrosPrestados) {
        this.nombre = nombre;
        this.dni = dni;
        this.maxLibrosPrestados = maxLibrosPrestados;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getMaxLibrosPrestados() {
        return maxLibrosPrestados;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public boolean puedeTomarPrestado() {
        return librosPrestados.size() < maxLibrosPrestados;
    }

    public void tomarPrestado(Libro libro) {
        if (puedeTomarPrestado() && libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println(nombre + " ha tomado prestado el libro: " + libro.getTitulo());
        } else {
            System.out.println("No es posible tomar prestado el libro: " + libro.getTitulo());
        }
    }

    public void devolver(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.setDisponible(true);
            System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " no tiene este libro prestado.");
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", librosPrestados=" + librosPrestados +
                ", maxLibrosPrestados=" + maxLibrosPrestados +
                '}';
    }
}
