class Rectangle extends Shape {
    private double sideA;
    private double sideB;
    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}