package poo;

/**
 * @author Elian Briones
 */
// Abstract class cannot be instanciated.
public abstract class Person {

    protected String name;
    protected int age;
    protected int height;
    protected int weight;

    public Person() {
        this.name = "";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public int getAge(){return age;};

}
