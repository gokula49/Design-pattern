package Factory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create products using the factory
        Product product1 = ProductFactory.createProduct("Product1");
        Product product2 = ProductFactory.createProduct("Product2");

        // Use the products
        product1.display();
        product2.display();

    }
}