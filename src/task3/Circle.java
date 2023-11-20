package task3;

public class Circle extends Shape{
    private final Double PI = 3.14;
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    void square() {
        System.out.println("Square circle is - " + PI * Math.pow(radius,2));

    }

    @Override
    void perimeter() {
        System.out.println("Perimeter circle is - " + 2 * PI * radius);
    }
}
