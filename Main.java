public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Circle",11);
        shapes[1] = new Rectangle("Rectangle", 2, 11);
        shapes[2] = new Quad("Quad", 11);
        shapes[3] = new Trapezium("Trapezium", 2, 11, 20);
        shapes[4] = new Triangle("Triangle", 2, 11);
        Print.print(shapes);
    }
}
