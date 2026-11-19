package tp2.ejercicio01;
 
public class Main  {

    public static void main(String[] args) {  

        Empleado empleado1 = new Empleado("Valentina", 28, 750000);
  
        System.out.println("nombre " + empleado1.getNombre());
        System.out.println("edad: " + empleado1.getEdad());
        System.out.println("cobra   " + empleado1.getSalario());

    }
    

}



   