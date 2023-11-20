package task3;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    @Override
    void square() {
        System.out.println("Square rectangle is - " + height * width);
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter rectangle is - " + 2 * (width + height));
    }
}
