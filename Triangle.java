class Triangle extends Shape{
    private double baseLength;
    private double height;

    public Triangle(String name, double baseLength, double height) {
        super(name);
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 0.5 * baseLength * height;
    }
}