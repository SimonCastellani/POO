namespace TP2.Ejercicio03.Perro;

public class Perro : Animal
{
    private string raza;

    public Perro(string nombre, int edad, string raza)
        : base(nombre, edad)
    {
        this.raza = raza;
    }

    public string GetRaza()
    {
        return raza;
    }

    public void SetRaza(string raza)
    {
        this.raza = raza;
    }

    public void ladrar()
    {
        Console.WriteLine("el perro está ladrando");
    }
}
