package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Stream;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String showListCar(@RequestParam(value = "count",defaultValue = "5") int count, Model model) {
        Stream<Car> stream = carService.getListCar().stream();
        List<Car> carList = stream.limit(count).toList();
        model.addAttribute("carList",carList);
        return "cars";
    }
}
