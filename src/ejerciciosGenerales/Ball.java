package ejerciciosGenerales;

/**
 *
 * @author Elian Briones
 */
public class Ball {

    String name;
    int pressure;
    boolean isAvailable;
    
    public Ball(String name) {
        this.name = name;
        this.pressure = 5;
        this.isAvailable = true;
    }
    
    public void blowUp(int qtyPressure) {
        this.pressure += qtyPressure;
        if (this.pressure >= 20) this.isAvailable = false;
    }
    
    public String bounce() {
        if (!this.isAvailable)
            return this.name + "'s ball cannot bounce because of its pressure.";
         else
            return this.name + "'s ball is doing BOING-BOING";
    }
    
    public void deflate(int qtyPressure) {
        this.pressure -= qtyPressure;
    }
}
