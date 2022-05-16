package barcelonaActiva;

/**
 *
 * @author Elian Briones
 */
public class Cat extends Animal {
    
    @Override
    public void run(int age) {
        System.out.println("Method of Cat class. This animal has " + age + " years");
        super.run(age);
    }
    
    
}
