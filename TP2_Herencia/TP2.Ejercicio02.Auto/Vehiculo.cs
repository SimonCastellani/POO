namespace TP2.Ejercicio02.Auto;

public class Vehiculo
{
    private string marca;
    private string modelo;

    public Vehiculo(string marca, string modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    public string GetMarca()
    {
        return marca;
    }

    public void SetMarca(string marca)
    {
        this.marca = marca;
    }

    public string GetModelo()
    {
        return modelo;
    }

    public void SetModelo(string modelo)
    {
        this.modelo = modelo;
    }
}
