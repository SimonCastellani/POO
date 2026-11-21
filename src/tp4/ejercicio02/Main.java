package tp4.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Simón", "4826");
        BilleteraVirtual billetera =
                new BilleteraVirtual("Tomi", "Mercado Pago");

        tarjeta.procesarPago(12500);
        System.out.println();
        billetera.procesarPago(8750.50);
        System.out.println();

        tarjeta.procesarPago(-100);
    }
}
