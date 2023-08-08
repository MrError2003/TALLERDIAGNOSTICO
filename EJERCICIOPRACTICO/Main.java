package EJERCICIOPRACTICO;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", "9780545582889");
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "9780544003415");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        Usuario usuario1 = new Usuario("Juan", "12345678", 2);
        Usuario usuario2 = new Usuario("María", "98765432", 3);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        biblioteca.prestarLibro(usuario1, libro1);
        biblioteca.prestarLibro(usuario1, libro2);
        biblioteca.prestarLibro(usuario2, libro1);

        usuario1.devolver(libro1);
        usuario2.devolver(libro1);
    }
}
