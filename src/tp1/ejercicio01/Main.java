
package tp1.ejercicio01;


public class Main {
    public static void main(String[] args) {  
        Persona persona1 = new Persona(); 
         
         
        persona1.nombre = "Simon";
        persona1.edad = 17; 
     
        Persona persona2 = new Persona();
        persona2.nombre = "Santino";
        persona2.edad = 30;   
        System.out.println(persona1.nombre + "tiene" + persona1.edad + "años");
        System.out.println(persona2.nombre + "tiene" + persona2.edad + "años");     
    }

 
}
   