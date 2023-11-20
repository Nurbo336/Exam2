package task3;

public class Triangle extends Shape{
    private Double a;
    private Double b;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Double c;

    @Override
    void square() {
        Double p = a + b + c;
        System.out.println("Square triangle is - " + Math.sqrt(p) * (p - a) * (p - b) * (p - c));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter triangle is - " + a + b + c);
    }
}
