package tp3.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Lucía", 35, "Programación");
        Preceptor preceptor = new Preceptor("Marcos", 41, "5to 1ra");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        System.out.println();
        System.out.println("cambiando la edad del docente");
        docente.setEdad(36);
        docente.mostrarInformacion();
    }
}
