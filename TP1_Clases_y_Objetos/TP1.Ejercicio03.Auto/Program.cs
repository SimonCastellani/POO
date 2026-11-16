namespace TP1.Ejercicio03.Auto;

internal static class Program
{
    public static void Main()
    {
        Auto primero = new Auto("Fiat", "Cronos", "blanco");
        Auto segundo = new Auto("Peugeot", "208", "gris");
        Auto tercero = new Auto("Renault", "Sandero", "rojo");

        primero.mostrarDatos();
        segundo.mostrarDatos();
        tercero.mostrarDatos();
    }
}
