package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Main {
    public static void main(String[] args) {
        
        // - - - - - - - - - - - - - - NIVEL 1 - - - - - - - - - - - - - -
        // EX1 - Vehicle
        Ex1_Vehicle v = new Ex1_Vehicle();
        v.init();
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX2 - Calling static and non-sttic methods
        Ex1_Vehicle.stop();
        v.accelerate();
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX3 - Show the initialization of Vehicle class
        // Already set in Vehicle class above constructor method
        // {System.out.println()}
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX4 - Difference betwwen static final, final and static field
        
        // Final values cannot be reassigned. We can access by its class name because it's an STATIC field
        // Ex1_Vehicle.yearOfProduction = 2500; 
            
        // Final values cannot be reassigned. Final modifier is a constant variable
        // v.minimumSpeed = 30;
        
        // We can access STATIC variables by its class name. Static variables are the SAME for each object
        // Ex1_Vehicle.numDoors = 2;
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX5 - Create Animal class with 3 overloaded methods.  Create subclass and override run() method
        Cat c = new Cat();
        c.run(5);
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX6 - Create Amphibian class with their methods. Create new subclass
        Amphibian a = new Frog(); // Superclass
        Frog f = new Frog(); // Subclass
        a.breathe();
        a.moving();
        a.eat();
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX7 - Add jump() to Frog class and invoke it on main class
        //a.jump(); It throws an error because it's a method which belongs to subclass, not superclass
        
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // EX8 - Modify the Amphibian object to make it useful for Frog methods
        Frog newFrog = (Frog) a; // We make a casting for a Amphibian object
        newFrog.jump();
        
        
        // - - - - - - - - - - - - - - NIVEL 2 - - - - - - - - - - - - - -
        // EX1 - Create Cycle class with 3 subclasses. Generic instances type Cycle by method
        Cycle cy = new Cycle();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(cy);
        ride(u);
        ride(b);
        ride(t);
        
        // EX2 - Add wheels() to Cycle, return nº wheels. ride() invokes wheels()
        ride(cy); // It return number of wheels
        
        // EX3 - Add balance() to Unicycle and Bicycle. 3 generic for a cycle objects array.
        Cycle[] arrayCycles = new Cycle[3];
        
        // 2 WAYS. Both used for make a generic Cycle
        Cycle un1 = new Unicycle();
        Cycle un2 = (Cycle) new Unicycle();
        
        Bicycle bi1 = new Bicycle();
        Tricycle t1 = new Tricycle();
        
        arrayCycles[1] = bi1;
        arrayCycles[2] = un2;
        
        for (Cycle cycle : arrayCycles) {
            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            }
        }
        
        // EX4 - Create Rodent class with 3 subclass. Set 3 same methods with different content.
        // Create obj array of Rodent and fill with subclass. Invoke methods of super class
        Rodent[] arrayRodents = new Rodent[3];
        Rat r1 = new Rat();
        Jerbu j1 = new Jerbu();
        Hamster h1 = new Hamster();
        
        arrayRodents[0] = r1;
        arrayRodents[1] = j1;
        arrayRodents[2] = h1;
        
        for (Rodent rodent : arrayRodents) {
            rodent.correr();
            rodent.ensumar();
            rodent.rossegar();
        }
        
        // - - - - - - - - - - - - - - NIVEL 3 - - - - - - - - - - - - - -
        // EX1 - Base class, 2 methods. First one invokes second one. Create Inherited class and
        // replace second method. Create obj of Inherited class, generic obj to Base class and invokes first method.
        Base b1 = new Inherited();
        b1.method1();
        
    }
    
        public static void ride(Cycle c) {
            c.wheels();
            System.out.println("Number of wheels is: " + c.wheels());
        }
}
