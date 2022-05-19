package exceptions;

/**
 *
 * @author Elian Briones
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4 types of Exceptions
        // Runtime Exception - It appears when we execute our program
        
        // Index Out Of Bounds - When we try to access to any position of obj or array 
        int[] arrTest = {1, 2, 3};
        arrTest[2] = 10;
        arrTest[3] = 20; // Throws error
        
        // Null Pointer Exception - It occurs when u try to use a reference that points to no location
        Object obj = null;
        System.out.println(obj.toString());
        
        // Arithmethic Exception - Math error for example infinity 
        int res = 12 / 0;
        System.out.println(res);
        
        
    }
    
}
