package collections;

/**
 *
 * @author Elian Briones
 */
public class Product {
    private int code;
    private double price;
    private String name;

    public Product(int code, double price, String name) {
        this.code = code;
        this.price = price;
        this.name = name;
    }
    
    public Product() {}

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", price=" + price + ", name=" + name + '}';
    }
    
    
}
