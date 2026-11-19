package tp3.ejercicio02;

class Docente extends Persona {
    private String materia;

    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void mostrarInformacion() {
        System.out.println("Docente");
        System.out.println("nombre: " + getNombre());
        System.out.println("edad: " + getEdad());
        System.out.println("materia: " + materia);
    }
}
