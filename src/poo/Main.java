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
        Vehicle v = new Vehicle();
        Vehicle v2 = new Vehicle("red", 80, "renault", "remix2.0");
        
        System.out.println(v2.toString());
    }
    
}

