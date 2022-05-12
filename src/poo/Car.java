package poo;
/**
 *
 * @author Elian Briones
 */
public class Car extends Vehicle{
    private int numDoors;
    private int trunkSize;
    
    // Default constructor. No params
    public Car() {
        super();
        this.numDoors = 4;
        this.trunkSize = 100;
    }

    // Normal constructor. With params
    public Car(int numDoors, int trunkSize, String color, int caballos, String marca, String modelo) {
        super(color, caballos, marca, modelo);
        this.numDoors = numDoors;
        this.trunkSize = trunkSize;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    @Override
    public String toString() {
        return "numDoors = " + numDoors + "\ntrunkSize = " + trunkSize + super.toString();
    }
    
    
}
