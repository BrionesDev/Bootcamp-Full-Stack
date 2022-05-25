package tutorial;

/**
 *
 * @author Elian Briones
 */
public class Main {
    public static void main(String[] args) {
        Box<Integer> list = new Box<>();
        test(list, "Hola", list);
        
        Par<Integer> p = new Par<>(1,2);
        Par<Character> p1 = new Par<>('a','b');
    }
    
    public static <T> void test(T t1, String name, T t2) {
        System.out.println(t1.toString());
        System.out.println(name);
    }
    
}
