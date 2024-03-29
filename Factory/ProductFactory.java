package Factory;

class ProductFactory {
    // Method to create products based on type
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("Product1")) {
            return new ConcreteProduct1();
        } else if (type.equalsIgnoreCase("Product2")) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }
}
