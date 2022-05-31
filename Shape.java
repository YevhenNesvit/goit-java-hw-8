abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract String getName();

    abstract double getArea();
}