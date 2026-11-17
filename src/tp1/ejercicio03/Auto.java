package tp1.ejercicio03;

class Auto {
    private String marca;
    private String modelo;
    private String color;
  

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
         this.color = color;
    } 
 
    public void mostrarDatos() {
        System.out.println("Yo tengo un" + marca + " el modelo es" + modelo + "color" + color);
    }
 
  
}

