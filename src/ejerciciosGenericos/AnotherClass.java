package ejerciciosGenericos;

/**
 *
 * @author Elian Briones
 */
public class AnotherClass {

    public <T extends MyInterface> void invokeMethods(T t1) {
        t1.getMida();
        t1.printObject();
    }
    
}
