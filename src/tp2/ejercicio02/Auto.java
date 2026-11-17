package tp2.ejercicio02;

class Auto extends Vehiculo {

    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        setCantPuertas(cantPuertas);
    }

    public int getCantPuertas()  {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        if (cantPuertas <= 0) {
            throw new IllegalArgumentException("tiene que tener al menos una puerta");
        }
        this.cantPuertas = cantPuertas;
    }


    public void mostrarDatos()  {
        System.out.println("marca " + getMarca());
        System.out.println("el modelo es " + getModelo());
        System.out.println("puertas: " + getCantPuertas());
    }
}
