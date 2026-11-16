namespace TP1.Ejercicio01.Persona;

internal static class Program
{
    public static void Main()
    {
        Persona primera = new Persona();
        primera.nombre = "Ana";
        primera.edad = 20;

        Persona segunda = new Persona();
        segunda.nombre = "Lucas";
        segunda.edad = 22;

        Console.WriteLine(primera.nombre + " tiene " + primera.edad + " años.");
        Console.WriteLine(segunda.nombre + " tiene " + segunda.edad + " años.");
    }
}
