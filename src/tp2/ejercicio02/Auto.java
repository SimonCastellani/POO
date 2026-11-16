package tp2.ejercicio02;

class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        setCantPuertas(cantPuertas);
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        if (cantPuertas <= 0) {
            throw new IllegalArgumentException("La cantidad de puertas debe ser mayor a cero.");
        }
        this.cantPuertas = cantPuertas;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cantidad de puertas: " + getCantPuertas());
    }
}
