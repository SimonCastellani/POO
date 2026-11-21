package tp4.ejercicio01;

class LibroDigital extends MaterialDigital {
    public LibroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(getTitulo());
        System.out.println("Se puede leer en pantalla");
    }
}
