package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Elian Briones
 */
public class TutoCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //showFruits();
        //testArrays();
        //runRoom();
        arrayList();
    }

    public static void showFruits() {
        String[] fruits = {"Orange", "Banana", "Apple", "Peach"};
        Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void testArrays() {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 1;
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

        String[] characs = new String[3];
        characs[0] = "c";
        characs[1] = "b";
        characs[2] = "a";
        Arrays.sort(characs);
        for (String charac : characs) {
            System.out.println(charac);
        }
    }

    public static void runRoom() {
        Room[] arrayRooms = {
            new Room("Elian", 3),
            new Room("Andreu", 2),
            new Room("Didac", 1),
        };
        
        // Show the reference in memory of each object
        System.out.println("- - - - -");
        for (Room arrayRoom : arrayRooms) {
            System.out.println("Room of " + arrayRoom);
        }
        
        // Sort an array of objects. Must implement Comparable interface which sort a dynamic and static array
//        Arrays.sort(arrayRooms);
        System.out.println("- - - - -");
        for (Room arrayRoom : arrayRooms) {
            System.out.println("Rooms sorted - " + arrayRoom);
        }
        
        // Set your own sorting rule. Must use Comparator<Class>. Same expression as arrow functions in JS
        Arrays.sort(arrayRooms, (Room o1, Room o2) -> o1.getName().compareTo(o2.getName()));
    }
    
    public static void arrayList() {
        // Create ArrayList, add items, show their elements (by sout or forEach)
        ArrayList<Room> list = new ArrayList<>();
        list.add(new Room("Elian", 10));
        list.add(new Room("Andreu", 20));
        list.add(new Room("Didac", 30));
        
        // Remove item by Index
        list.remove(2);
        
        // Remove item by Object. It doesn't work unless you define equals() method in your Class.java
        list.remove(new Room("Elian", 10));
        
        for (Room el : list) {
            System.out.println(el);
        }
        
        // equals() useful for contains(Object), indexOf(Object) & lastIndexOf(Object). Look object state, not its pointer
        System.out.println(list.contains(new Room("Andreu", 20)));
        
        // Use Collections.sort() instead of Arrays.sort()
        Collections.sort(list, (Room first, Room second) -> first.getName().compareTo(second.getName()));
        for (Room room : list) {
            System.out.println(room);
        }
    }
}
