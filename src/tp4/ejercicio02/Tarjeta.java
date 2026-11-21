package tp4.ejercicio02;

class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    public String getUltimosCuatroDigitos() {
        return ultimosCuatroDigitos;
    }

    public void setUltimosCuatroDigitos(String ultimosCuatroDigitos) {
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0 || !Double.isFinite(monto)) {
            System.out.println("El monto tiene que ser mayor que cero");
            return;
        }

        System.out.println("Pago con tarjeta a nombre de " + getTitular());
        System.out.println("Tarjeta terminada en " + ultimosCuatroDigitos);
        super.procesarPago(monto);
    }
}
