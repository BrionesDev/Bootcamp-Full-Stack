
package tutorial;

/**
 *
 * @author Elian Briones
 */
public class Box<T> {
    private T data;
    public Box(){super();}
    public T remove(){return data;}
    public void add(T d) {data = d;}
    
    
}
