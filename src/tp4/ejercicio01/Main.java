package tp4.ejercicio01;

public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("El principito");
        Audiolibro audio = new Audiolibro("Alicia en el país de las maravillas");

        libro.mostrarDescripcion();
        System.out.println();
        audio.mostrarDescripcion();
    }
}
