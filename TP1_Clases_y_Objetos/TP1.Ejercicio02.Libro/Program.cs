namespace TP1.Ejercicio02.Libro;

internal static class Program
{
    public static void Main()
    {
        Libro primero = new Libro("El túnel", "Ernesto Sabato", 1948);
        Libro segundo = new Libro("Rayuela", "Julio Cortázar", 1963);

        Console.WriteLine(primero.titulo + " - " + primero.autor + " (" + primero.anio + ")");
        Console.WriteLine(segundo.titulo + " - " + segundo.autor + " (" + segundo.anio + ")");
    }
}
