package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Elian Briones
 */
public class TutoCollections {

    /**
     * @param args the command line arguments
     */
    
    static String[] a = {"cuatro", "cinco", "seis"};
    
    public static void main(String[] args) {
        //showFruits();
        //testArrays();
        //runRoom();
        //arrayList();
        //test();
        //test("uno", "dos", "tres");
        //test(a);
        productExercise();
    }

    public static void showFruits() {
        // Iterator used for ArrayList. IMPORTANT
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
        
        // Make a clone of an array
        Room[] cloneRoom = arrayRooms.clone();
        
        // Show the reference in memory of each object
        System.out.println("- - - - -");
        for (Room arrayRoom : arrayRooms) {
            System.out.println("Room of " + arrayRoom);
        }
        
        // Sort an array of objects. Must implement Comparable interface which sort a dynamic and static array
        Arrays.sort(arrayRooms);
        System.out.println("- - - - -");
        for (Room arrayRoom : arrayRooms) {
            System.out.println("Rooms sorted - " + arrayRoom);
        }
        
        // Set your own sorting rule. Must use Comparator<Class>. Same expression as arrow functions in JS
        Arrays.sort(arrayRooms, (Room o1, Room o2) -> o1.getName().compareTo(o2.getName()));
        
        // 2n way to set your own rule. Without arrow function. Must have compare() and Comparator<Obj>
        Arrays.sort(arrayRooms, new Comparator<Room>() {
            @Override
            public int compare(Room o1, Room o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
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
        
        // Use Collections.sort() instead of Arrays.sort(). Sort current array
        Collections.sort(list, (Room first, Room second) -> first.getName().compareTo(second.getName()));
        for (Room room : list) {
            System.out.println(room);
        }
    }
    
    public static void test(String... nums) {
        System.out.println("Num of args: " + Arrays.toString(nums));
        System.out.println("Lenght: " + nums.length);
        
        for (String num : nums) {
            System.out.println("Num: " + num);
        }
    }
    
    public static void productExercise() {
        
        // ArrayList allows repeated objects, NO natural sort, sort by entered elements
        List<Product> productList = new ArrayList<>();
        
        productList.add(new Product(2, 20, "Carne picada"));
        productList.add(new Product(3, 50, "Queso semicurado"));
        productList.add(new Product(4, 5, "Lentejas"));
        productList.add(new Product(5, 10, "Merluza"));
        
        // Add 2 repeated products
        productList.add(new Product(4, 5, "Lentejas"));
        productList.add(new Product(5, 10, "Merluza"));
        
//        for (Product product : productList) {
//            System.out.println(product);
//        }
        
        // HashSet doesn't allow repeated, NO natural sort, and NO sort by entered elements
        Set <Product> productSet = new HashSet<>();
        Product p1 = new Product(1, 100, "Jamón ibérico");
        Product p2 = new Product(2, 15, "Garbanzos");
        productSet.add(p1);
        productSet.add(p2);
        
        // Add 2 repeated products
        productSet.add(p1);
        productSet.add(p2);
        
        for (Product product : productSet) {
            System.out.println("HashSet without NEW (adding by variable) " + product);
        }
        
        // TEST - If we add() "new Product", they will be treated as independent objects, so they will be repeated
        // To avoid, we need to implement equals() and hashCode() to make it functional
        productList.add(new Product(100, 1, "algo"));
        productList.add(new Product(200, 2, "algo2"));
        
        productList.add(new Product(100, 1, "algo"));
        productList.add(new Product(200, 2, "algo2"));
        
        
        for (Product product : productSet) {
            System.out.println("HashSet with NEW " + product);
        }
        
        // HashMap - Collection of key/value. It sorts (by default) by its String, order descendent
        HashMap<String, Room> roomMap = new HashMap<>();
        roomMap.put("40", new Room("Elian", 1));
        roomMap.put("80", new Room("Andreu", 2));
        roomMap.put("10", new Room("Sandra", 3));
        roomMap.put("20", new Room("Dodac", 4));
        roomMap.put("30", new Room("Ezequiel", 5));
        
        for (String key : roomMap.keySet()) { 
            System.out.println("Key: " + key);
        }
        
        for (Room value : roomMap.values()) {
            System.out.println("Value: " + value);
        }
        
        for (Map.Entry<String, Room> entry : roomMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println("Entry: " + entry);
        }
        
        // Same example but swapping String for Integer. It will sort by INT in order descendant
        HashMap<Integer, Room> roomMap2 = new HashMap<>();
        roomMap2.put(40, new Room("Elian", 1));
        roomMap2.put(80, new Room("Andreu", 2));
        roomMap2.put(10, new Room("Sandra", 3));
        roomMap2.put(20, new Room("Dodac", 4));
        roomMap2.put(30, new Room("Ezequiel", 5));
        
        for (Map.Entry<Integer, Room> entry : roomMap2.entrySet()) {
            Integer key = entry.getKey();
            System.out.println("Key: " + key);
            Room value = entry.getValue();
            System.out.println("Value: " + value);
        }
        
        
    }
    
    
}
