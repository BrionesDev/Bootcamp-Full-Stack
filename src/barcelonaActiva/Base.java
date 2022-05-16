package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Base {
    public void method1(){
        System.out.println("First method");
        method2();
    }
    
    public void method2(){
        System.out.println("Method 2 invoked by Method 1");
    }
}
