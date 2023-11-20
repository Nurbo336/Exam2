package task3;

public class GeometryCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15.0,10.0);
        Triangle triangle = new Triangle(5.0,3.0,6.0);
        Circle circle = new Circle(15.0);
        rectangle.square();
        rectangle.perimeter();
        circle.perimeter();
        circle.square();
        triangle.perimeter();
        triangle.square();

    }
}
