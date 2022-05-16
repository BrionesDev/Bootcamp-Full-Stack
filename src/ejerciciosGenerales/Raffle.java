package ejerciciosGenerales;

/**
 *
 * @author Elian Briones
 */
public class Raffle {
    int numBalls;
    int numExtractions = numBalls;
    
    public Raffle(int balls) {
        if (balls <= 0) numBalls = 49;
        numBalls = balls;
    }
    
    public int takeBall() {
        if (numExtractions <= 0) return -1;
        numExtractions--;
        return numExtractions;
    }
    
    public void reset() {
        numBalls = 49;
    }
}
