package poo;

/**
 *
 * @author Elian Briones
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle v = new Vehicle(); // Empty constructor
        Vehicle v2 = new Vehicle("red", 80, "renault", "remix2.0"); // Constructor with params
        
        v.color = "yellow";
        v.caballos = 10;
        v.marca = "nissan";
        v.modelo = "ultra";
        
//        System.out.println(v.toString());
//        System.out.println(v2.toString());
        
        Car c = new Car(5, 50, "purple", 75, "BMW", "mega");
        System.out.println(c.toString());
    }
    
}

