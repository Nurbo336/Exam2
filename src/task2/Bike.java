package task2;

public class Bike extends Vehicle{
    private String name;
    private Integer year;

    public Bike(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bike " +
                "mark - " + name +" " +
                "year of make - " + year;

    }

    @Override
    void start() {
        System.out.println("Bike is start");
    }
    @Override
    void stop() {
        System.out.println("Bike is stop");
    }
}
