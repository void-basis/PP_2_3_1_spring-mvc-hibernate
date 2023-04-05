package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.resourses.CarList;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    public final CarServiceImpl carService;

    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        model.addAttribute("carsList", carService.returnAllCars());
        return "cars";
    }
    @GetMapping(value = "/car2")
    public String carByCount(@RequestParam(value = "count") int count, ModelMap model) {
        model.addAttribute("car2", carService.returnCarByCount(count));
        return "car2";
    }
}
