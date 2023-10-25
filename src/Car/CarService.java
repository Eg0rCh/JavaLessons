package Car;


import java.util.Arrays;

public class CarService {

    public void repairEngine(Car car) {
        car.getEngine().setDurability(100);
    }

    public Car priorityRepair(Car[] cars) {
        CarService carService = new CarService();
        Arrays.sort(cars, this::compareDurability);
        cars[0].getEngine().setDurability(100);
        return cars[0];

    }

    public int compareDurability(Car car1, Car car2) {
        return Integer.compare(car1.getEngine().getDurability(), car2.getEngine().getDurability());
    }
}
