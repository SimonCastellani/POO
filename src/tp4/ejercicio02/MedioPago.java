package tp4.ejercicio02;

class MedioPago {
    private String titular;

    public MedioPago(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void procesarPago(double monto) {
        if (monto <= 0 || !Double.isFinite(monto)) {
            System.out.println("El monto tiene que ser mayor que cero");
            return;
        }

        System.out.printf("Procesando pago por $%.2f%n", monto);
    }
}
