package tp1.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Libro primero = new Libro("El túnel", "Ernesto Sabato", 1948);
        Libro segundo = new Libro("Rayuela", "Julio Cortázar", 1963);

        System.out.println(primero.titulo + " - " + primero.autor + " (" + primero.anio + ")");
        System.out.println(segundo.titulo + " - " + segundo.autor + " (" + segundo.anio + ")");
    }
}
