package EJERCICIOPRACTICO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> librosDisponibles;
    private List<Usuario> usuariosRegistrados;

    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    public List<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    public void prestarLibro(Usuario usuario1, Libro libro2) {
    }

}
