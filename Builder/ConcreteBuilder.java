package Builder;

class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPart1(String part1) {
        product.setPart1(part1);
    }

    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }

    @Override
    public void buildPart3(String part3) {
        product.setPart3(part3);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}


