package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW",2007);
        Bus bus = new Bus("LOTOS",2010);
        Bike bike = new Bike("SUZUKI",2013);
        System.out.println(car);
        car.start();
        car.stop();
        System.out.println(bike);
        bike.start();
        bike.stop();
        System.out.println(bus);
        bus.stop();
        bus.start();
    }
}
