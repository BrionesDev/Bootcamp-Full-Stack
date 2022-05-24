package tutorial;

/**
 *
 * @author Elian Briones
 */
public class Moto extends Vehiculo {
    private final int precio;
    private final String descripcion;

    public Moto() {
        precio = 1000;
        descripcion = "una moto";
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
