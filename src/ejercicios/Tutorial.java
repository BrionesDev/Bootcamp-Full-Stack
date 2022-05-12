package ejercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Arrays;


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
//        System.out.println("Enter your first value");
//        int firstValue = validateInteger();
//        System.out.println("Enter your second value");
//        int secondValue = validateInteger();
//        
//        int result = 0;
//        
//        for (int i = firstValue; i <= secondValue; i++) {
//            result += i;
//        }
//        System.out.println("Final result: " + result);
        
        // Ejercicio 12. Adivinar un número entre 1 y 100.
//        System.out.println("Guess a new number between 1 and 100. Press -1 to finish game.");
//        int userNum = validateInteger();
//        boolean numberGuessed = false;
//        Random rand = new Random();
//        int randomNum = rand.nextInt(101); // Límite - 1 / 100 - 1
//
//        if (userNum != -1) {
//            while (!numberGuessed) {
//                if (userNum <= 100) {
//                    if (userNum > randomNum) {
//                        System.out.println("Your entered number is above from the correct number");
//                        userNum = validateInteger();
//                    } else if (userNum < randomNum) {
//                        System.out.println("Your entered number is below from the correct number");
//                        userNum = validateInteger();
//                    } else {
//                        System.out.println("Great!! You guessed the number\nNumber guessed: " + randomNum);
//                        numberGuessed = true;
//                    }                
//                } else {
//                    System.out.println("Enter numbers only between 0 and 100");
//                    userNum = validateInteger();
//                }
//            }
//        } else {
//            System.out.println("Thanks for playing!!");
//        }
        
        // Ejercicio 13. Sumar números introducidos por el usuario. Num negativo 
//        System.out.println("Enter a number. Enter negative number to finish the program");
//        ArrayList<Integer> userNums = new ArrayList<>();
//        
//        while (true) {            
//            int userInput = validateInteger();
//            if (userInput < 0) break;
//            userNums.add(userInput);
//        }
//        System.out.println("Negative number entered. Exiting program!\n");
//        for (int i = 0; i < userNums.size(); i++) {
//            if (i == 0) System.out.println("- - - - - Numbers entered by user - - - - - ");
//            System.out.print(userNums.get(i) +  ", ");
//        }
        
        // Ejercicio 14. Pedir una fecha en formato dia/mes/año y mostrarlo por pantalla
//        System.out.println("Enter a num");
//        int userOption = validateInteger(), year = 0, days = 0;
//        String month = "";
//        
//        switch (userOption) {
//            case 1:
//                month = "enero";
//                days = 31;
//                year = askYear();
//                break;
//            case 2:
//                month = "febrero";
//                days = 28;
//                year = askYear();
//                break;
//            case 3:
//                month = "marzo";
//                days = 31;
//                year = askYear();
//                break;
//            case 4:
//                month = "abril";
//                days = 30;
//                year = askYear();
//                break;
//            case 5:
//                month = "mayo";
//                days = 31;
//                year = askYear();
//                break;
//            case 6:
//                month = "junio";
//                days = 30;
//                year = askYear();
//                break;
//            case 7:
//                month = "julio";
//                days = 31;
//                year = askYear();
//                break;
//            case 8:
//                month = "agosto";
//                days = 31;
//                year = askYear();
//                break;
//            case 9:
//                month = "septiembre";
//                days = 30;
//                year = askYear();
//                break;
//            case 10:
//                month = "octubre";
//                days = 31;
//                year = askYear();
//                break;
//            case 11:
//                month = "noviembre";
//                days = 30;
//                year = askYear();
//                break;
//            case 12:
//                month = "diciembre";
//                days = 31;
//                year = askYear();
//                break;
//            default:
//                System.out.println("The option entered doesn't exist");
//        }
//        System.out.println("La fecha siguiente tiene\nDias: " + days + "\nMes: " + month + "\nAño: " + year);
        
        // Ejercicio 15. Mostrar abecedario A-Z y después a la inversa.
//        char[] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
//            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//        
//        for (int i = 0; i < abecedario.length; i++) {
//            System.out.print(abecedario[i] + ", ");
//        }
//        System.out.println();
//        for (int j = abecedario.length - 1; j >= 0; j--) {
//            System.out.print(abecedario[j] + ", ");
//        }
        
        // Ejercicio 16. Introducir 10 nums y mostrarlos de forma inversa
//        int[] userNums = new int[10];
//        int counter = 0;
//        
//        while (counter < 10) {
//            System.out.println("Enter a number");
//            int userInput = validateInteger();
//            userNums[counter] = userInput;
//            counter++;
//        }
//        
//        System.out.println("- - - - - Total numbers entered - - - - -");
//        for (int i = userNums.length - 1; i >= 0;    i--) {
//            System.out.print(userNums[i] + ", ");
//        }
        
        // Ejercicio 17. Comprobar si hay un elemento duplicado dentro de un array
//        int[] numbers = {8, 12, 31, 12, 24, 7, 1, 31, 34, 24};
//        HashSet <Integer> nonDuplicatedArray = new HashSet<>();
//        
//        // 1a solución con HashSet
//        for (int num : numbers) {
//            if (!nonDuplicatedArray.add(num)) 
//                System.out.println("Duplicated element: " + num);
//        }
//        
//        // 2a solución con 2 FOR's
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] == numbers[j]) System.out.println("Duplicated element: " + numbers[j]);
//            }
//        }
        
        // Ejercicio 18. Pedir tamaño de array, valores a introducir, suma de valores, mínimo y máximo
//        int[] nums = createArray();
//        int result = 0, min = 0, max = 0;
//        
//        for (int i = 0; i < nums.length; i++) {
//            
//            // 1a forma. Min & Max. if-else
////            if (nums[i] > nums[0]) max = nums[i];
////            else min = nums[i];
//            
//            // Sum result
//            result += nums[i];
//        }
//        
//        // 2a forma. Min & Max. Arrays.sort
//        Arrays.sort(nums);
//        System.out.println("Minimum value: " + nums[0]);
//        System.out.println("Maximum value: " + nums[nums.length - 1]);
//        
//        System.out.println("Final result: " + result);
//        System.out.println("Minimum value: " + min);
//        System.out.println("Maximum value: " + max);

        // Ejercicio 19. Pedir notas y calcular media de aprobados y suspensos. Terminar programa con "11"
//        ArrayList <Integer> userNumbers = new ArrayList<>();
//        ArrayList <Integer> aprobados = new ArrayList<>();
//        ArrayList <Integer> suspensos = new ArrayList<>();
//        int mediaAprobados = 0, mediaSuspensos = 0;
//        
//        while (true) {
//            System.out.println("- - - Enter a new qualification - - -");
//            int userInput = validateInteger();
//            userInput = validatePositiveNum(userInput);
//            if (userInput == 11) break;
//            userNumbers.add(userInput);
//        }
//        
//        for (int i = 0; i < userNumbers.size(); i++) {
//            if (userNumbers.get(i) >= 5) aprobados.add(userNumbers.get(i));
//            if (userNumbers.get(i) < 5) suspensos.add(userNumbers.get(i));
//        }
//        
//        System.out.println("Approved qualifications: ");
//        for (int i = 0; i < aprobados.size(); i++) {
//            mediaAprobados += aprobados.get(i);
//            System.out.print(aprobados.get(i) + ", ");
//        }
//        
//        System.out.println("\nFailed qualifications: ");
//        for (int i = 0; i < suspensos.size(); i++) {
//            mediaSuspensos += suspensos.get(i);
//            System.out.print(suspensos.get(i) + ", ");
//        }
//        
//        mediaAprobados /= aprobados.size();
//        System.out.println("\nMedia aprobados: " + mediaAprobados);
//        
//        mediaSuspensos /= suspensos.size();
//        System.out.println("Media suspensos: " + mediaSuspensos);
        
        // Ejercicio 20. 
//        int[] firstSerie = createIntArray();
//        int[] secondSerie = createIntArray();
//
//        System.out.println("First serie: ");
//        for (int i : firstSerie) {
//            System.out.print(i + "\t");
//        }
//        
//        System.out.println("\nSecond serie: ");
//        for (int i : secondSerie) {
//            System.out.print(i + "\t");
//        }
//        
//        System.out.println();
//        for (int i = 0; i < firstSerie.length; i++) {
//            if (firstSerie[i] > secondSerie[i]) {
//                System.out.println("Number " + firstSerie[i] + " is greater than " + secondSerie[i]);
//            } else if (firstSerie[i] < secondSerie[i]) {
//                System.out.println("Number " + firstSerie[i] + " is smaller than " + secondSerie[i]);
//            } else {
//                System.out.println("Number " + firstSerie[i] + " is equals to " + secondSerie[i]);
//            }
//        }
        
        // Ejercicio 21. En un array size 10, meter los 5 primeros en un array y los otros 5 en otro array
//        int[] nums = {99, 6, 84, 11, 0, 77, 34, 21, 38, 100};
//        int[] firstArray = new int [5];
//        int[] secondArray = new int [5];
//        
//        for (int i = 0; i < nums.length / 2; i++) {
//            firstArray[i] = nums[i];
//            secondArray[i] = nums[i + 5];
//        }
//        
//        System.out.println("Values of first array: ");
//        for (int i : firstArray) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//        System.out.println("\nValues of second array: ");
//        for (int i : secondArray) {
//            System.out.print(i + ", ");
//        }
        
        // Ejercicio 22. 2 arrays, sumar el 1er valor del 1er array con el último del 2n array hasta completar los 2 arrays
        int[] firstArray = {1, 68, 55};
        int[] secondArray = {77, 23, 92};
        int result = 0;
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    /** ----- FUNCTIONS ----- */
    // EX 11
    public static int validateInteger() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter only integer numbers");
            sc.next();
        }
       return sc.nextInt();
    }
    
    // EX 14
    public static int askYear() {
        System.out.println("Enter a year");
        return validateInteger();
    }
    
    // EX 18
    public static int validatePositiveNum(int num) {
        while (num < 0) {            
            System.out.println("Please enter only positive numbers");
            num = sc.nextInt();
        }
        return num;
    }
    
    public static int[] createIntArray() {
        System.out.println("Enter size of your number array");
        int arrSize = validateInteger();
        int[] arrNums = new int[arrSize];
        
        for (int i = 0; i < arrNums.length; i++) {
            System.out.println("Enter a new value for your array");
            int userNum = validateInteger();
            userNum = validatePositiveNum(userNum);
            arrNums[i] = userNum;
        }
        return arrNums;
    }

}
