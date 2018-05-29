package club.cheapok.entity;

public class Apple {
    private final String color;
    private final double weight;

    public Apple(final String color, final double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
