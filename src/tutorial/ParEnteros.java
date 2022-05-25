package tutorial;

/**
 *
 * @author Elian Briones
 */
public class ParEnteros {
    private int a, b;

    public ParEnteros(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public ParEnteros swap() {
        return new ParEnteros(b,a);
    }
}
