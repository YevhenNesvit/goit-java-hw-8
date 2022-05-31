public class Print {
    public static void print() {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("Circle",11);
        shapes[1] = new Rectangle("Rectangle", 2, 11);
        shapes[2] = new Quad("Quad", 11);
        shapes[3] = new Trapezium("Trapezium", 2, 11, 20);
        shapes[4] = new Triangle("Triangle", 2, 11);

        for (Shape shape : shapes) {
            System.out.println("Name is " + shape.getName() + ", area = " + shape.getArea());
        }
    }
}
