package Homework8.Task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Triangle("Green", 3.0, 4.0, 5.0);

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            }

        Shape shape1 = new Circle("Red", 5.0);
        Shape shape2 = new Circle("Red", 5.0);
        System.out.println("shape1.equals(shape2): " + shape1.equals(shape2));
        System.out.println("shape1.hashCode(): " + shape1.hashCode());
        System.out.println("shape2.hashCode(): " + shape2.hashCode());
        System.out.println("shape1.toString(): " + shape1);
    }
}