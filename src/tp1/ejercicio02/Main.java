package tp1.ejercicio02;

public class Main  {  
     
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("Titulo1", "Simon Castellani", 2009);
        Libro libro2 = new Libro("Titulo2", "Persona", 2000);

        System.out.println(libro1.titulo + " - " + libro1.autor + " (" + libro1.anio + ")"); 
        System.out.println(libro2.titulo + libro2.autor + libro2.anio);  
      
    } 



   


}
 