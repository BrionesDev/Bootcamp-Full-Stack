package barcelonaActiva;

import java.util.Scanner;

/**
 *
 * @author Elian Briones
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
//        firstProblem();
//        secondProblem();
//        thirdProblem();
        fourthProblem();
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
        int[] arrTest = {1, 2, 3};
        try {
            arrTest[2] = 10;
            arrTest[3] = 20; // Throws error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            System.err.println(e.toString());
        }
    }
    
    public static void fourthProblem() {
        try {
            System.out.println("Enter a number");
            int userNum = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.err.println("You should enter a number");
        }
    }
    
    public static class MyException extends Exception {
 
        public MyException(String str) {
            super(str);
        }

    }
}
