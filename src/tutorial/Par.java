package tutorial;

/**
 *
 * @author Elian Briones
 */
public class Par<T>{
    private T a, b;

    public Par(T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    public Par swap() {
        return new Par(b,a);
    }
}
