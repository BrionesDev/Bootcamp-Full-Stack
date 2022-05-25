package ejerciciosGenericos;

/**
 *
 * @author Elian Briones
 */
public class Main {
    public static void main(String[] args) {
//        levelOne();
        levelTwo();
    }
    
    public static void levelOne() {
        // EX1 - Simulate a generic class
        String a = "", b = "", c = "";
        NoGenericMethods o = new NoGenericMethods(a, b, c);
        NoGenericMethods o2 = new NoGenericMethods(c, b, a);
        
        // EX2 - Create Person class with their attributes. Create GenericMethod with generic function and invoke
        int d = 1, e = 2, f = 3;
        boolean g = true, h = false, i = true;
        GenericMethods.displayResult(d, e, f);
        GenericMethods.displayResult(g, h, i);
        GenericMethods.displayResult(new Person(), 'a', 200);
    }
    
    public static void levelTwo() {
        // EX1 - Same as previous exercise but make 1 of their params non-generic
        String data = "hola";
        Object obj = new Object();
        int i = 1;
        GenericMethods.displayResult2(data, obj.toString(), i);
        
        // EX2 - Same exercise but make a list of args at params of the generic function
        GenericMethods.displayResult3("Hola", 1, 'a', "Todos", true, new Person());
    }
    
}
