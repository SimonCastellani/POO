namespace TP1.Ejercicio05.Rectangulo;

internal static class Program
{
    public static void Main()
    {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.SetBase(8);
        rectangulo.SetAltura(4);
        Console.WriteLine("Área del rectángulo: " + rectangulo.CalcularArea());
    }
}
