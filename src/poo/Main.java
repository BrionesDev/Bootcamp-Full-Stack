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
        
        // Show both instances
        System.out.println(v.toString());
        System.out.println(v2.toString());
        
        // Create car instance inherited by Vehicle class
        Car c = new Car(5, 50, "purple", 75, "BMW", "mega");
        System.out.println(c.toString());
        
        // Create intance Radio inside Car class
        Car newCar = new Car();
        Car.Radio radio = newCar.new Radio();
        newCar.setRadio(radio);
        radio.switchOff();
        
        // Any subclass can be casted through by its superclass
        Vehicle vh1 =  new Car();
        Vehicle vh2 =  new Motorbike();
        Car aCar = new Car();
        Vehicle vh3 = aCar;
        
        // An interface object can be assigned to any object which implements that interface
        Product p1 = new Car();
        Product p2 = new Motorbike();
        Car c3 = new Car();
        Product p3 = c3;
      
        
    }
    
}

