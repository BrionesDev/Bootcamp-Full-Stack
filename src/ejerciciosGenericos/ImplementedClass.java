package ejerciciosGenericos;

/**
 *
 * @author Elian Briones
 */
public class ImplementedClass implements MyInterface {

    public int mida;
    public Object obj;
    
    @Override
    public int getMida() {
        System.out.println("Mida - " + mida);
        return mida;
    }

    @Override
    public void printObject() {
        System.out.println(obj);
    }
    
}
