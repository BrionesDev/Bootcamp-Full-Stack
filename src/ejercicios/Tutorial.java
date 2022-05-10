package ejercicios;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author formación
 */
public class Tutorial {

    /**
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    static final double EURO_TO_DOLLAR = 1.5; // EX 2
    
    public static void main(String[] args) {
        
        // Ejercicio 1. Pedir valor y sumarle 3
//        System.out.println("Enter your first number: ");
//
//        int userValue = sc.nextInt();
//        int result = userValue + 3;
//        System.out.println("Final result is " + result);
        
        // Ejercicio 2. Conversor de euros a dólares. 1 euro = 1.5 dólares
//         System.out.println("Enter amount to calculate");
//        
//         int userValue = sc.nextInt();
//         double result = userValue * EURO_TO_DOLLAR;
//         System.out.println("Your total dollars are: " + result);
        
        // Ejercicio 3. Pedir y mostrar nombre producto, precio y unidad
//        System.out.println("Enter your product name");
//        String productName = sc.nextLine();
//        
//        System.out.println("Enter its price");
//        double productPrice = sc.nextDouble();
//        
//        System.out.println("Enter quantity of this product");
//        int quantityProduct = sc.nextInt();
//        
//        double totalPrice = productPrice * quantityProduct;
//        System.out.println("Product name: " + productName +
//        "\nPrice of this product: " + productPrice + " euros" +
//        "\nQuantity: " + quantityProduct +
//        "\nTotal price: " + totalPrice
//        );
        
        // Ejercicio 4. Establecer idioma según la opción que elija el usuario
//        System.out.println("- - - - - SELECCIONA UN IDIOMA - - - - -");
//        System.out.println("1. Castellano\n 2. Catalán\n 3. Inglés");
//        int userOption = sc.nextInt();
//        
//        switch (userOption) {
//            case 1:
//                System.out.println("Gracias");
//                break;
//            case 2:
//                System.out.println("Gràcies");
//                break;
//            case 3:
//                System.out.println("Thank you");
//                break;
//            default:
//                System.out.println("La opción introducida no existe");
//        }
        
        // Ejercicio 5. Calcular producto escalar de 2 vectores.
//        int firstArray[] = {1, 5, 10, 20, 15, 6, 90, 100, 2, 3, 11};
//        int secondArray[] = {75, 21, 55, 9, 8, 4, 88, 1000, 1, 66, 99};
//        int finalResult = 0;
//        
//        for (int i = 0; i < firstArray.length; i++) {
//            
//            System.out.println("Value on 1st array: " + firstArray[i]);
//            System.out.println("Value on 2nd array: " + secondArray[i]);
//            System.out.println("Calculate: " + firstArray[i] * secondArray[i] + "\n- - - - - - - - - - - -");
//            
//            
//            finalResult = finalResult + firstArray[i] * secondArray[i];
//        }
//        
//        System.out.println("Your total result is: " + finalResult);
        
        
        // Ejercicio 7. Cuenta regresiva 100 a 1 con while, do-while y for
//        int initialValue = 100;
//        while (1 <= initialValue) {
//            System.out.println("WHILE - Current value: " + initialValue);
//            initialValue--;
//        }
//        
//        initialValue = 100;
//        
//        do {
//            System.out.println("DO-WHILE - Current value: " + initialValue);
//            initialValue--;
//        } while (1 <= initialValue);
//        
//        for (initialValue = 100; 1 <= initialValue; initialValue--) {
//            System.out.println("FOR - Current value: " + initialValue);
//        }
        
        
        // Ejercicio 8. Multiplicar 2 nums usando únicamente sumas
//        System.out.println("Enter your first value");
//        int firstValue = sc.nextInt();
//        System.out.println("Enter your second value");
//        int secondtValue = sc.nextInt();
//        int result = 0, i = 0;
//        
//        while (i < secondtValue) {
//            result += firstValue;
//            i++;
//        }
//        System.out.println(firstValue + " * " + secondtValue + " = " + result);
        
        // Ejercicio 9. Introducir un número y hacer su multiplicación de los 5 siguientes números
//        System.out.println("Enter a number");
//        int userValue = sc.nextInt();
//        int numToMultiply = userValue + 5;
//        int result = 0;
//        
//        while (numToMultiply > userValue) {
//            result = userValue * numToMultiply;
//            System.out.println("Cálculo: " + userValue + " * " + numToMultiply + " = " + result);
//            numToMultiply--;
//        }

        // Ejercicio 10. Introducir 10 nums o preguntar hasta introducir un num negativo
//        int enteredNums = 0;
//        ArrayList <Integer> userNumbers = new ArrayList<>();
//        
//        while (enteredNums < 10) {
//            
//            System.out.println("Enter a number");
//            int userValue = sc.nextInt();
//            
//            if (userValue < 0) {
//                System.out.println("Negative number entered (" + userValue + "), goodbye!");
//                userNumbers.add(userValue);
//                break;
//            }
//            
//            System.out.println("Entered number: " + userValue + "\n- - - - - -");
//            userNumbers.add(userValue);
//            enteredNums++;
//        }
//        
//        System.out.println("Total numbers entered by user: ");
//        for (int i = 0; i < userNumbers.size(); i++) {
//            if (userNumbers.get(i) == 0) userNumbers.remove(i);
//            System.out.print(userNumbers.get(i) + ", ");
//        }
        
        // Ejercicio 11. Calcular suma entre 2 números introducidos por el user.
        System.out.println("Enter your first value");
        int firstValue = validateInput();
        System.out.println("Enter your second value");
        int secondValue = validateInput();
        
        int result = 0;
        
        for (int i = firstValue; i <= secondValue; i++) {
            result += i;
        }
        System.out.println("Final result: " + result);
    }
    
    
/** ----- FUNCTIONS ----- */
    // EX 11
    public static int validateInput() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter only integer numbers");
            sc.next();
        }
       return sc.nextInt();
    }
    
    // Ejercicio 12.  
           
}
