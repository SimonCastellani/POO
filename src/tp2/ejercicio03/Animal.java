package tp2.ejercicio03;

class Animal {

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
         this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0)  {
            throw new IllegalArgumentException("la edad no puede ser negativa");
        }
        this.edad = edad;
    }
}
