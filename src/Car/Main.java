package Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota", new Engine(90));
        cars[1] = new Car("Honda", new Engine(80));
        cars[2] = new Car("Ford", new Engine(70));
        cars[3] = new Car("Chevrolet",new Engine(40));
        cars[4] = new Car("Nissan", new Engine(50));

        CarService carService = new CarService();

        carService.priorityRepair(cars);
        System.out.println(cars[0].getModel());

    }

}
