package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getListCar() {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("Lada","Red");
        Car car2 = new Car("BMW","Green");
        Car car3 = new Car("Kamaz","Black");
        Car car4 = new Car("Audi","White");
        Car car5 = new Car("Lexus","Pink");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;
    }
}
