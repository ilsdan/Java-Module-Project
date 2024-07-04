import java.util.ArrayList;

public class Race {

    ArrayList<Car> cars = new ArrayList<>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car getWinner() {

        Car winningCar = cars.get(0);

        for (Car car : cars) {
            if (getDistance(winningCar.speed) < getDistance(car.speed)) {
                winningCar = car;
            }
        }

        return winningCar;
    }

    int getDistance(int speed) {
        return speed*24;
    }

}
