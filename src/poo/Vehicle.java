package poo;

/**
 *
 * @author Elian Briones
 */
public class Vehicle {
    // Attributes usually privates but methods are usually publics
    public String color;
    public int caballos;
    public String marca;
    public String modelo;
    
    // Empty constructor. Default values
    public Vehicle() {
        this.color = "defYellow";
        this.caballos = 10;
        this.marca = "defPeugeot";
        this.modelo = "defPlus";
    }

    // Constructor with values set by user
    public Vehicle(String color, int caballos, String marca, String modelo) {
        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "color = " + color + ",\ncaballos = " + caballos + ",\nmarca = " + marca + ",\nmodelo = " + modelo;
    }
    
    
}
