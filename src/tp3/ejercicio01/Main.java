package tp3.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Simón");
        Jugador jugador2 = new Jugador("Tomi");

        mostrarJugador(jugador1);
        mostrarJugador(jugador2);

        jugador1.ganarPuntos(15);
        jugador2.ganarPuntos(10);

        jugador1.ganarPuntos(-3);
        jugador2.subirNivel();

        System.out.println();
        System.out.println("despues de cambiar los valores");
        mostrarJugador(jugador1);
        mostrarJugador(jugador2);
    }

    private static void mostrarJugador(Jugador jugador) {
        System.out.println("nombre: " + jugador.getNombre());
        System.out.println("nivel: " + jugador.getNivel());
        System.out.println("puntos: " + jugador.getPuntos());
    }
}
