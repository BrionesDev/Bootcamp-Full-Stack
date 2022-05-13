package ejerciciosGenerales;

/**
 *
 * @author Elian Briones
 */
public class Elevator {
    
    int minimumFloor;
    int maximumFloor;
    int currentFloor;

    public Elevator(int minimumFloor, int maximumFloor) {
        this.minimumFloor = minimumFloor;
        this.maximumFloor = maximumFloor;
        this.currentFloor = minimumFloor;
    }
    
    public void goTo(int numFloor) {
        if (numFloor <= maximumFloor) currentFloor = maximumFloor;
        else if (numFloor >= minimumFloor) currentFloor = minimumFloor;
        else currentFloor = numFloor;
    }
    
    public void goDown() {
        if (currentFloor > minimumFloor) currentFloor--;
    }
    
    public void goUp() {
        if (currentFloor < maximumFloor) currentFloor++;
    }

    public int getMinimumFloor() {
        return minimumFloor;
    }

    public int getMaximumFloor() {
        return maximumFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    
}
