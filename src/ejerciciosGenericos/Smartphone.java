package ejerciciosGenericos;

/**
 *
 * @author Elian Briones
 */
public class Smartphone implements Phone {

    @Override
    public void call() {
        System.out.println("CALL");
    }
    
    public void takePic() {
        System.out.println("TAKE PIC");
    }
    
}
