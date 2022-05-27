package ejerciciosGenericos;

/**
 *
 * @author Elian Briones
 */
public class Generic {
    public <T extends Phone> void method1(T t1) {
        t1.call();
        
    }
    
    public <T extends Smartphone> void method2(T t2) {
        t2.takePic();
    }
}
