package tp2.ejercicio01;

class Empleado extends Persona {

    private double salario;


    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
         setSalario(salario);
    }

    public double getSalario()  {
        return salario;
    }

    public void setSalario(double salario) {
        if (!Double.isFinite(salario) || salario < 0) {
            throw new IllegalArgumentException("el salario tiene que ser 0 o mayor y finito");
        }
        this.salario = salario;
    }
}
