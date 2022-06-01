public class Print {
    public static void print(Shape[] shapes) {

        for (Shape shape : shapes) {
            System.out.println("Name is " + shape.getName() + ", area = " + shape.getArea());
        }
    }
}
