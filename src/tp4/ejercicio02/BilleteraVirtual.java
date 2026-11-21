package tp4.ejercicio02;

class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0 || !Double.isFinite(monto)) {
            System.out.println("El monto tiene que ser mayor que cero");
            return;
        }

        System.out.println("Pago por billetera virtual a nombre de " + getTitular());
        System.out.println("Aplicación: " + nombreAplicacion);
        super.procesarPago(monto);
    }
}
