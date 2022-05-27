package ejerciciosGenericos;

import java.util.Arrays;

/**
 *
 * @author Elian Briones
 */
public class GenericMethods {
    public static <T> void displayResult(T t1, T t2, T t3) {
        System.out.println("First element: " + t1.toString());
        System.out.println("Second element: " + t2.toString());
        System.out.println("Third element: " + t3.toString());
    }
    
    public static <T> void displayResult2(T t1, T t2, int i) {
        System.out.println("First element: " + t1.toString());
        System.out.println("Second ele ment: " + t2.toString());
        System.out.println("Non-generic element: " + i);
    }
    
    public static <T> void displayResult3(T ...t1) {
        System.out.println("Element: " + Arrays.toString(t1));
    }
}
