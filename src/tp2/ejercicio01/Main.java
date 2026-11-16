package tp2.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Valentina", 28, 750000);
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: " + empleado.getSalario());
    }
}
