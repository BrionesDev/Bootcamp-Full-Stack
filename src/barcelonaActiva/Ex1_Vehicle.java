package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Ex1_Vehicle {
    
    static final int yearOfProduction = 2000;
    final int minimumSpeed = 30;
    static int numDoors;
    
    // With this code block, we show the initialization of this class
    {
        System.out.println("Instance Initialization Block");
    }

    public Ex1_Vehicle() {
        
    }
    
    public void init() {
        System.out.println("Class Vehicle has been instanciated");
    }
    
    public static void stop() {
        System.out.println("Stop method IS AN STATIC method");
    }
    
    public void accelerate() {
        System.out.println("Accelerate method IS NOT STATIC ");
    }
    
}
