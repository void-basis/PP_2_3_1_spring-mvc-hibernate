package web.resourses;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarList {
    public List <Car> carsList= new ArrayList<>();

    {
        //carsList = new ArrayList<>();
        carsList.add(new Car("audi", "s-line", 111));
        carsList.add(new Car("bmw", "7", 222));
        carsList.add(new Car("wolkswagen", "tuareg", 333));
        carsList.add(new Car("ford", "focus", 444));
        carsList.add(new Car("volvo", "v40", 555));
    }
    public List<Car> returnCarByCount(int count) {
        //сервис с методом, который будет возвращать указанное число машин из созданного списка.
        List<Car> car2 = new ArrayList<>();
        if (count <= 5) {
            for (int i = 0; i < count; i++) {
                car2.add(carsList.get(i));
            }
            return car2;
        } else {
            return carsList;
        }
    }
    public List<Car> returnAllCars() {
        return carsList;
    }
}
