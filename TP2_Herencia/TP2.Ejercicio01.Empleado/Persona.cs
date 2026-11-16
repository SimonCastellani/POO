namespace TP2.Ejercicio01.Empleado;

public class Persona
{
    private string nombre;
    private int edad;

    public Persona(string nombre, int edad)
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
