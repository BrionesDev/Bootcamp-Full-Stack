package poo;
/**
 *
 * @author Elian Briones
 */
public class Car extends Vehicle implements Product {
    private int numDoors;
    private int trunkSize;
    public static int test; // static have same value for each instances
    public final int age = 2000; // final = constant variable
    public Radio radio;
    
    // Default constructor. No params
    public Car() {
        super();
        numDoors = 4;
        trunkSize = 100;
        radio = new Radio();
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

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Car{" + "numDoors=" + numDoors + ", trunkSize=" + trunkSize + ", age=" + age + ", radio=" + radio + '}';
    }
    
    // Methods from Product Interface
    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
    
    // Declare class Radio
    public class Radio {
        boolean isOn;
        int frequency;
        public void switchOn(){}
        public void switchOff(){}
    }
    
}
