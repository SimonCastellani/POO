namespace TP1.Ejercicio03.Auto;

public class Auto
{
    private string marca;
    private string modelo;
    private string color;

    public Auto(string marca, string modelo, string color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void mostrarDatos()
    {
        Console.WriteLine("Tengo un " + marca + " modelo " + modelo + " de color " + color);
    }
}
