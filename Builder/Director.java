package Builder;

public class Director {
    public Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1("Part 1");
        builder.buildPart2("Part 2");
        builder.buildPart3("Part 3");
    }
}
