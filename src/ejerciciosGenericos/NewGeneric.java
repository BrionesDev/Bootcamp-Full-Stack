package ejerciciosGenericos;

/**
 *
 * @author Elian Briones
 */
public class NewGeneric {
    public <T extends NewInterface1> void invokeMethod1(T t){
        t.method1();
    }
    
    public <T extends NewInterface2> void invokeMethod2(T t){
        t.method2();
    }
}
