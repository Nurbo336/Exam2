package task2;

public class Car extends Vehicle{
    private String name;
    private Integer year;

    public Car(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car " +
                "mark - " + name +" " +
                "year of make - " + year;

    }

    @Override
    void start() {
        System.out.println("Car is start");

    }

    @Override
    void stop() {
        System.out.println("Car is stop");
    }
}
