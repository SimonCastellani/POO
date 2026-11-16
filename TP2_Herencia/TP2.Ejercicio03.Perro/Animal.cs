namespace TP2.Ejercicio03.Perro;

public class Animal
{
    private string nombre;
    private int edad;

    public Animal(string nombre, int edad)
    {
        this.nombre = nombre;
        SetEdad(edad);
    }

    public string GetNombre()
    {
        return nombre;
    }

    public void SetNombre(string nombre)
    {
        this.nombre = nombre;
    }

    public int GetEdad()
    {
        return edad;
    }

    public void SetEdad(int edad)
    {
        if (edad < 0)
        {
            throw new ArgumentOutOfRangeException(nameof(edad), "La edad debe ser mayor o igual a cero.");
        }
        this.edad = edad;
    }
}
