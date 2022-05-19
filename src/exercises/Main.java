package exercises;

import java.util.Scanner;

/**
 *
 * @author Elian Briones
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        firstExercise();
//        secondExercise();
        thirdExercise();
//        fourthExercise();

    }

    public static void firstExercise() {
        // Forces an error and manage it
        System.out.println("- - - - - Enter your value - - - - -");
        try {
            int userValue = Integer.parseInt(sc.next());
            System.out.println("Your value is: " + userValue);

        } catch (NumberFormatException e) {
            System.err.println("You should enter a NUMBER " + e.getMessage());
        }
    }

    public static void secondExercise() {
        System.out.println("- - - - - Enter first value - - - - -");
        int first = sc.nextInt();
        
        try {
            int numFact = factorial(first);
        } catch (LimitException e) {
            System.err.println("Your value " + first + " IS NOT between 0 and 20");
            System.err.println(e.getMessage());
        }
    }
    
    public static void thirdExercise() {
        System.out.println("- - - - - Enter your value - - - - -");
        int userValue = sc.nextInt();
        try {
            int fact = factorial(userValue);
            System.out.println("Factorial of " + userValue + " is " + fact);
            if (userValue % 2 == 0) 
                System.out.println(userValue + " IS EVEN");
            else
                System.out.println(userValue + " IS ODD");
        } catch (LimitException e) {
            System.err.println("Number not in 0 and 20");
            System.err.println(e.getMessage());
        }
    }
    

    public static int factorial(int num) throws LimitException {
        int res = 0;
        if (num > 0 && num < 20) {
            for (; 1 < num; num--) {
                res *= num;
            }
            return res;
        }
        throw new LimitException();
    }

    public static class LimitException extends Exception {
    }
}
