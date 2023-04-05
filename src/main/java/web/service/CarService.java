package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> returnCarByCount(int count);

    public List<Car> returnAllCars();
}
