namespace TP2.Ejercicio02.Auto;

public class Auto : Vehiculo
{
    private int cantPuertas;

    public Auto(string marca, string modelo, int cantPuertas)
        : base(marca, modelo)
    {
        SetCantPuertas(cantPuertas);
    }

    public int GetCantPuertas()
    {
        return cantPuertas;
    }

    public void SetCantPuertas(int cantPuertas)
    {
        if (cantPuertas <= 0)
        {
            throw new ArgumentOutOfRangeException(nameof(cantPuertas), "La cantidad de puertas debe ser mayor a cero.");
        }
        this.cantPuertas = cantPuertas;
    }

    public void mostrarDatos()
    {
        Console.WriteLine("Marca: " + GetMarca());
        Console.WriteLine("Modelo: " + GetModelo());
        Console.WriteLine("Cantidad de puertas: " + GetCantPuertas());
    }
}
