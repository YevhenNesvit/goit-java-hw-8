class Quad extends Shape {
    private double sideA;

    public Quad(String name, double sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
}