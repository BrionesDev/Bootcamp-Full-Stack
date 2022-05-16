package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Inherited extends Base {
    @Override
    public void method1(){
        System.out.println("First method of INHERITED class");
        method2();
    }
    
    @Override
    public void method2(){
        System.out.println("Method 2 invoked by Method 1 in INHERITED class");
    }
}
