package tutorial;

import java.io.Serializable;

/**
 *
 * @author Elian Briones
 */
public class Vehiculo implements Serializable {
    public String color;
    public int caballos;
    public String marca;
    public String modelo;

    public Vehiculo() {
        color = "azul";
        caballos = 180;
        marca = "renault";
        modelo = "remix";
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", caballos=" + caballos + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
}
