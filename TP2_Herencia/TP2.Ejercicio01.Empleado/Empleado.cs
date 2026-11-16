namespace TP2.Ejercicio01.Empleado;

public class Empleado : Persona
{
    private double salario;

    public Empleado(string nombre, int edad, double salario)
        : base(nombre, edad)
    {
        SetSalario(salario);
    }

    public double GetSalario()
    {
        return salario;
    }

    public void SetSalario(double salario)
    {
        if (!double.IsFinite(salario) || salario < 0)
        {
            throw new ArgumentOutOfRangeException(nameof(salario), "El salario debe ser un número finito mayor o igual a cero.");
        }
        this.salario = salario;
    }
}
