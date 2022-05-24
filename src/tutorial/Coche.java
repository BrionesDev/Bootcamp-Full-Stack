package tutorial;

/**
 *
 * @author Elian Briones
 */
public class Coche extends Vehiculo {
    private final int numPuertas;
    private final int capacidadMaletero;

    public Coche() {
        numPuertas = 4;
        capacidadMaletero = 50;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Coche{" + "numPuertas=" + numPuertas + ", capacidadMaletero=" + capacidadMaletero + '}' + super.toString();
    }
    
    
    
}
