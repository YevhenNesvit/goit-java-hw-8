class Trapezium extends Shape {
    private double sideA;
    private double sideB;
    private double height;

    public Trapezium(String name, double sideA, double sideB, double height) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }
}