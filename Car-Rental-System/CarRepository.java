import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    List<Car> cars = new ArrayList<>();
    public Car findById(int id){
        for(Car car : cars){
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }

    public Car findCar(CarType type){
        for(Car car : cars){
            if(car.getCartype() == type  && car.getStatus() == Status.AVAILABLE){
                return car;
            }
        }

        return null;
    }

    public void saveCar(Car car){
        cars.add(car);
    }

}
