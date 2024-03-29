package Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();
        Product product = builder.getProduct();
        System.out.println(product);
    }
}

//In this example:
//
//Product is the complex object to be constructed.
//Builder is an interface defining the construction steps.
//ConcreteBuilder implements the Builder interface to construct and assemble parts of the Product.
//Director is responsible for orchestrating the construction process.
//Client code creates a ConcreteBuilder, passes it to the Director, and then asks the Director to construct the product. Finally, it retrieves the product from the buildehis way, the client code remains independent of the product's construction process and can create different representations of the product by using different builders.
