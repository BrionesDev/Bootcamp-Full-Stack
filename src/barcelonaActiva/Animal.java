package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Animal {
    
    // Override same method 
    public void run(String name) {
        System.out.println(name + " is now running");
    }
    
    public void run(int meters) {
        System.out.println("This animal has run " + meters + "meters");
    }
    
    public void run(boolean isRunning) {
        System.out.println("Is this animal running? - " + isRunning);
    }
    
}
