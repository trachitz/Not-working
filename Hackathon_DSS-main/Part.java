package model;

public class Part {
    private String name;
    private double cost;

    public Part(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Part [name=" + name + ", cost=" + cost + "]";
    }
}
