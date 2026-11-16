package tp1.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Persona primera = new Persona();
        primera.nombre = "Ana";
        primera.edad = 20;

        Persona segunda = new Persona();
        segunda.nombre = "Lucas";
        segunda.edad = 22;

        System.out.println(primera.nombre + " tiene " + primera.edad + " años.");
        System.out.println(segunda.nombre + " tiene " + segunda.edad + " años.");
    }
}
