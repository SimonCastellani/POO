namespace TP2.Ejercicio01.Empleado;

internal static class Program
{
    public static void Main()
    {
        Empleado empleado = new Empleado("Valentina", 28, 750000);
        Console.WriteLine("Nombre: " + empleado.GetNombre());
        Console.WriteLine("Edad: " + empleado.GetEdad());
        Console.WriteLine("Salario: " + empleado.GetSalario());
    }
}
