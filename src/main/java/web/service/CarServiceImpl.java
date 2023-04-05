package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.resourses.CarList;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    final
    CarList carList;

    public CarServiceImpl(CarList carList) {
        this.carList = carList;
    }

    @Override
    public List<Car> returnCarByCount(int count) {
        //сервис с методом, который будет возвращать указанное число машин из созданного списка.
        return carList.returnCarByCount(count);
    }

    @Override
    public List<Car> returnAllCars() {
        return carList.returnAllCars();
    }

}
