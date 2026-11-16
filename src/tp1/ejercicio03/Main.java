package tp1.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Auto primero = new Auto("Fiat", "Cronos", "blanco");
        Auto segundo = new Auto("Peugeot", "208", "gris");
        Auto tercero = new Auto("Renault", "Sandero", "rojo");

        primero.mostrarDatos();
        segundo.mostrarDatos();
        tercero.mostrarDatos();
    }
}
