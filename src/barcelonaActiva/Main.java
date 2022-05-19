package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Main {

    public static void main(String[] args) {
//        firstProblem();
//        secondProblem();
        thirdProblem();
    }

    public static void firstProblem() {
        try {
            Exception ex = new Exception("Exception message");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Finally message");
        }
    }

    public static void secondProblem() {
        Object obj = null;
        try {
            System.out.println(obj.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            System.err.println(e.toString());
        }
    }
    
    public static void thirdProblem() {
        
    }
}
