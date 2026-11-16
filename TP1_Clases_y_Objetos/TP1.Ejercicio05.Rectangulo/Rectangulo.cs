namespace TP1.Ejercicio05.Rectangulo;

public class Rectangulo
{
    private double baseRectangulo;
    private double altura;

    public double GetBase()
    {
        return baseRectangulo;
    }

    public void SetBase(double baseRectangulo)
    {
        this.baseRectangulo = baseRectangulo;
    }

    public double GetAltura()
    {
        return altura;
    }

    public void SetAltura(double altura)
    {
        this.altura = altura;
    }

    public double CalcularArea()
    {
        return baseRectangulo * altura;
    }
}
