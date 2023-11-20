package task2;

public class Bus extends Vehicle{
    private String name;

    private Integer year;
    public Bus(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bus " +
                "mark - " + name +" " +
                "year of make - " + year;
    }

    @Override
    void start() {
        System.out.println("Bus is start");
    }
    @Override
    void stop() {
        System.out.println("Bus is stop");
    }
}
