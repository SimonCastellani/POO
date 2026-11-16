namespace TP1.Ejercicio04.CuentaBancaria;

internal static class Program
{
    public static void Main()
    {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.SetSaldo(1500.50);
        Console.WriteLine("Saldo actual: " + cuenta.GetSaldo());
    }
}
